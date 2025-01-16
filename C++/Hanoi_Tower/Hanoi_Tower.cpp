#include<stdio.h>

void Hanoi_Tower(int num, char from, char by, char to) {
	if (num == 1) printf("���� 1�� %c ���� %c���� �ű��.\n", from, to);
	else {
		Hanoi_Tower(num - 1, from, by, to);
		printf("���� %d�� %c���� %c���� �ű��.\n", num, from, to);
		Hanoi_Tower(num - 1, by, from, to);
	}
}
int main() {
	Hanoi_Tower(15, 'A', 'B', 'C');
	return 0;
}