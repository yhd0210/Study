#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#define MAX_SIZE 10

int arr[MAX_SIZE];

int partition(int left, int right) {
	int pivot = arr[left];// 기준값을 뭘로 정할까요?
	int low = left + 1;// 초기화
	int high = right;// 초기화
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
			arr[high] = temp; // 값 교환
			printf("%d %d\n", arr[low], arr[high]);
		}
	} while (low < high);
	temp = arr[left]; 
	arr[left] = arr[high];
	arr[high] = pivot; // 값 교환(어떤 값들을 바꿔줘야할까요?)
	return high;// 어떤 값을 반환해야 할까요?
}

void quick_sort(int left, int right) {
	// left는 정렬해야 할 배열의 첫 인덱스 값, right는 마지막 인덱스 값
	if (left < right) {
		int q = partition(left, right); // partition함수는 피봇의 위치(인덱스)를 반환
		quick_sort(left, q - 1); // 왼쪽 리스트 매개변수는?
		quick_sort(q + 1, right); // 오른쪽 리스트 매개변수는?
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