#include<stdio.h>
#define MAX_STACK_SIZE 100

int stack[MAX_STACK_SIZE];
int top = -1;

//��ȭ���� Ȯ��
int is_full() {
	if (top == (MAX_STACK_SIZE - 1)) return 1;
	else return 0;// ������ ���� ���ִ��� �˻�
}

//������� Ȯ��
int is_empty() {
	if (top == -1) return 1;
	else return 0;// ������ ����ִ��� �˻�
}

void push(int n) {
	if (is_full() == 0) {
		top += 1;
		stack[top] = n;
		/*printf("%d\n", stack[top]);*/
	}
	else printf("stack overflow");
	// ���ÿ� ���ο� ��Ҹ� ����, �� ���� ������ ���� ���� �ʾҴ��� �˻�
}

int pop() {
	if (is_empty() == 0) {
		int n = stack[top];
		top -= 1;
		return n;
	}
	else printf("stack underflow");
	// ���ÿ� �ϳ��� ��Ҹ� ����, �� ���� ������ ����ִ��� �˻�
}

int main() {
	push(1);
	push(2);
	push(3);
	printf("%d\n", pop());
	printf("%d\n", pop());
	printf("%d\n", pop());

	return 0;
}