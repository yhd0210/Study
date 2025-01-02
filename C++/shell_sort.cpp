#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 10

int arr[MAX_SIZE];

void insertion_sort(int arr[], int first, int last, int gap) {
	int i, j, key;
	for (i = first + gap; i <= last; i+=gap) {
		key = arr[i];
		for (j = i - gap; j >= 0 && arr[j] > key; j = j - gap) {
			arr[j + gap] = arr[j];//������ j+1�� j�� �־����� ������ gap��ŭ �ڷ� �и� ���� �����ؾ��Ѵ�.
		}
		arr[j + gap] = key;//���������� j+1�� key�� �ִ� ���� �ƴ� gap��ŭ ���� ���� �����ؾ��Ѵ�.
}
}

void shell_sort(int arr[], int n) {
	int i, gap;
	for (gap = n / 2; gap > 0; gap /= 2) { // ���� ���ϱ� gap���� Ȱ��
		if (gap % 2 == 0) gap++; //gap�� ¦���� �� 1�� ���ϴ� ���� ���� ������ �м��Ǿ���.
		for (i = 0; i < gap; i++) {
			insertion_sort(arr, i, n-1, gap);
		}
	}
}

int main() {
	int n = MAX_SIZE;
		srand(time_t(NULL));
		for (int i = 0; i < n; i++) {
			arr[i] = rand() % 100;
		}

	shell_sort(arr, n);

	for (int i = 0; i < n; i++) {
		printf("%d ", arr[i]);
	}
	return 0;
}