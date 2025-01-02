#include<stdio.h>
#define MAX_STACK_SIZE 100
struct StackType {
	int data[MAX_STACK_SIZE];
	int top;
};

// ���� �ʱ�ȭ �Լ�
void init_stack(struct StackType* s)
{
	s->top = -1;
}

// ���� ���� ���� �Լ�
int is_empty(struct StackType* s)
{
	return s->top == -1 ? 1 : 0; // ���� ����
}
// ��ȭ ���� ���� �Լ�
int is_full(struct StackType* s)
{
	return s->top == MAX_STACK_SIZE - 1 ? 1 : 0; // ��ȭ ���� ����
}
// �����Լ�
void push(struct StackType* s, int item)
{
	if (is_full(s)) printf("overflow");
	else s->data[++s->top] = item;// �����Լ�
}
// �����Լ�
int pop(struct StackType* s)
{
	if (is_empty(s)) printf("underflow");
	else return s->data[s->top--];// �����Լ�
}
int main(void)
{
	struct StackType s;  // ������ �������� ����

	init_stack(&s);   // �Լ��� ȣ���� �� �Ű������� ������ �ּҸ� ����
	push(&s, 1);
	push(&s, 2);
	push(&s, 3);
	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
	printf("%d\n", pop(&s));
}