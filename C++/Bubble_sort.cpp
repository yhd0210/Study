#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 10

int arr[MAX_SIZE];
void Bubble_sort() {
	int a = 0;
	for (int n = 9; n > 0; n--) {
		for (int i = 0; i < 9; i++) {
			if (arr[i] > arr[i + 1]) {
				a = arr[i + 1];
				arr[i+1] = arr[i];
				arr[i] = a;
			}
		}
		for (int e = 0; e < 10; e++)
			printf(" %d", arr[e] );
		printf("\n");
	}
}

int main() {
	for (int i = 0; i < MAX_SIZE; i++) {
		scanf_s("%d", &arr[i]);
	}
	Bubble_sort();

	return 0;
}