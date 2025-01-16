#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX_SIZE 10

int arr[MAX_SIZE];

int partition(int left, int right) {
	int pivot = arr[left];// ���ذ��� ���� ���ұ��?
	int low = left + 1;// �ʱ�ȭ
	int high = right;// �ʱ�ȭ
	int temp;
	do {
		while (arr[low] < pivot) {
			low++;
		}
		while (arr[high] > pivot) {
			high--;
		}
		if (low < high) {
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp; // �� ��ȯ
			printf("%d %d\n", arr[low], arr[high]);
		}
	} while (low < high);
	temp = arr[left]; 
	arr[left] = arr[high];
	arr[high] = pivot; // �� ��ȯ(� ������ �ٲ�����ұ��?)
	return high;// � ���� ��ȯ�ؾ� �ұ��?
}

void quick_sort(int left, int right) {
	// left�� �����ؾ� �� �迭�� ù �ε��� ��, right�� ������ �ε��� ��
	if (left < right) {
		int q = partition(left, right); // partition�Լ��� �Ǻ��� ��ġ(�ε���)�� ��ȯ
		quick_sort(left, q - 1); // ���� ����Ʈ �Ű�������?
		quick_sort(q + 1, right); // ������ ����Ʈ �Ű�������?
	}
}

int main() {
	srand(time(NULL));
	int n = MAX_SIZE;
	for (int i = 0; i < n; i++)
		arr[i] = rand() % 100;

	quick_sort(0, n - 1);
	for (int i = 0; i < n; i++)
		printf("%d ", arr[i]);
	return 0;
}