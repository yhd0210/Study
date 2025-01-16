#include<stdio.h>

void Hanoi_Tower(int num, char from, char by, char to) {
	if (num == 1) printf("원판 1을 %c 에서 %c으로 옮긴다.\n", from, to);
	else {
		Hanoi_Tower(num - 1, from, by, to);
		printf("원판 %d을 %c에서 %c으로 옮긴다.\n", num, from, to);
		Hanoi_Tower(num - 1, by, from, to);
	}
}
int main() {
	Hanoi_Tower(15, 'A', 'B', 'C');
	return 0;
}