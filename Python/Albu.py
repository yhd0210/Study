import time
import cv2
import torch as t
import albumentations as a
import numpy as np
from torch.utils.data import Dataset
from matplotlib import pyplot as plt
from PIL import Image, ImageDraw

file_paths = ["C:/Users/yhd06/OneDrive/Desktop/iwaz/pothole_data/pothole_dataset/images/0007648.jpg"]
labels = ["C:/Users/yhd06/OneDrive/Desktop/iwaz/pothole_data/pothole_dataset/labels/0007648.txt"]

class AlbumentationsDataset(Dataset):
    def __init__(self, file_paths, labels, transform=None):
        self.file_paths = file_paths
        self.labels = labels
        self.transform = transform

    def __len__(self):
        return len(self.file_paths)

    def __getitem__(self, idx):
        file_path = self.file_paths[idx]
        label_path = self.labels[idx]
        
        image = cv2.imread(file_path)
        h, w, _ = image.shape
        image = cv2.cvtColor(image, cv2.COLOR_BGR2RGB)
        
        # Load YOLO labels and normalize coordinates
        bboxes, category_ids = self._load_labels(label_path, w, h)

        # Apply transformations
        start_t = time.time()
        if self.transform:
            augmented = self.transform(image=image, bboxes=bboxes, category_ids=category_ids)
            image = augmented['image']
            bboxes = augmented['bboxes']
            category_ids = augmented['category_ids']
            total_time = (time.time() - start_t)
        else:
            total_time = (time.time() - start_t)

        return image, bboxes, category_ids, total_time

    def _load_labels(self, label_path, img_width, img_height):
        bboxes = []
        category_ids = []
        with open(label_path, 'r') as file:
            for line in file.readlines():
                parts = line.strip().split()
                category_ids.append(int(parts[0]))
                x_center, y_center, width, height = map(float, parts[1:])
                
                # Normalize bounding box coordinates
                x_center /= img_width
                y_center /= img_height
                width /= img_width
                height /= img_height

                bboxes.append([x_center - width / 2, y_center - height / 2, x_center + width / 2, y_center + height / 2])
        
        return bboxes, category_ids

def draw_boxes(image, bboxes, category_ids):
    draw = ImageDraw.Draw(image)
    width, height = image.size

    for bbox in bboxes:
        left, top, right, bottom = bbox
        left = int(left * width)
        top = int(top * height)
        right = int(right * width)
        bottom = int(bottom * height)
        
        draw.rectangle([left, top, right, bottom], outline="red", width=2)
    return image

total_time = 0

albumentations_transform = a.Compose([
    a.HorizontalFlip(p=0.5),
    a.RandomBrightnessContrast(p=0.2),
    a.ShiftScaleRotate(shift_limit=0.0625, scale_limit=0.1, rotate_limit=45, p=0.5),
], bbox_params=a.BboxParams(format='yolo', label_fields=['category_ids']))

albumentations_dataset = AlbumentationsDataset(
    file_paths=file_paths,
    labels=labels,
    transform=albumentations_transform,
)

for i in range(20):
    sample, bboxes, category_ids, transform_time = albumentations_dataset[0]
    total_time += transform_time

print("albumentations time/sample: {:.2f} ms".format((total_time / 20) * 1000))

# Display one image with bounding boxes
image_pil = Image.fromarray(sample)
image_with_boxes = draw_boxes(image_pil, bboxes, category_ids)
plt.imshow(image_with_boxes)
plt.axis('off')
plt.show()