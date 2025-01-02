#include<stdio.h>
#define MAX_STACK_SIZE 100
struct StackType {
	int data[MAX_STACK_SIZE];
	int top;
};

// 스택 초기화 함수
void init_stack(struct StackType* s)
{
	s->top = -1;
}

// 공백 상태 검출 함수
int is_empty(struct StackType* s)
{
	return s->top == -1 ? 1 : 0; // 공백 검출
}
// 포화 상태 검출 함수
int is_full(struct StackType* s)
{
	return s->top == MAX_STACK_SIZE - 1 ? 1 : 0; // 포화 상태 검출
}
// 삽입함수
void push(struct StackType* s, int item)
{
	if (is_full(s)) printf("overflow");
	else s->data[++s->top] = item;// 삽입함수
}
// 삭제함수
int pop(struct StackType* s)
{
	if (is_empty(s)) printf("underflow");
	else return s->data[s->top--];// 삭제함수
}
int main(void)
{
	struct StackType s;  // 스택을 정적으로 생성

	init_stack(&s);   // 함수를 호출할 때 매개변수로 스택의 주소를 전달
	push(&s, 1);
	push(&s, 2);
	push(&s, 3);
	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
}