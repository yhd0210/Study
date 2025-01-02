#include<stdio.h>
#define MAX_STACK_SIZE 100

int stack[MAX_STACK_SIZE];
int top = -1;

//포화상태 확인
int is_full() {
	if (top == (MAX_STACK_SIZE - 1)) return 1;
	else return 0;// 스택이 가득 차있는지 검사
}

//공백상태 확인
int is_empty() {
	if (top == -1) return 1;
	else return 0;// 스택이 비어있는지 검사
}

void push(int n) {
	if (is_full() == 0) {
		top += 1;
		stack[top] = n;
		/*printf("%d\n", stack[top]);*/
	}
	else printf("stack overflow");
	// 스택에 새로운 요소를 삽입, 그 전에 스택이 가득 차지 않았는지 검사
}

int pop() {
	if (is_empty() == 0) {
		int n = stack[top];
		top -= 1;
		return n;
	}
	else printf("stack underflow");
	// 스택에 하나의 요소를 제거, 그 전에 스택이 비어있는지 검사
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