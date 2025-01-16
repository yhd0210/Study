#include<stdio.h>
#include<math.h>

void Hanoi_Tower(int num, char from, char by, char to) {
	if (num == 1) printf("%d %c %c\n",num, from, to);
	else {
		Hanoi_Tower(num - 1, from, to, by);
		printf("%d %c %c\n",num, from, to);
		Hanoi_Tower(num - 1, by, from, to);
	}
}
int main() {
	int n;
	scanf_s("%d", &n);
	printf("%d\n", int(pow(2, n)) - 1);
	Hanoi_Tower(n, '1', '2', '3');
	return 0;
}