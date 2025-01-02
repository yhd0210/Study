#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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

int check_matching(char* in)
{
	StackType s;
	char ch, open_ch;
	int i, n = strlen(in);  	// n���� ���ڿ��� ���̰� �Էµ�
	init_stack(&s);			// ������ �ʱ�ȭ

	for (i = 0; i < n; i++) {
		ch = in[i];		// ch = ���� ����
		switch (ch) {
			case '(':case'[':case'{':
				push(&s, ch);
				break;
			case ')':case']':case'}':
				if (is_empty(&s)) return 0; // ���� 2 �Ǵ�
				else { 
					open_ch = pop(&s); 
					if (!(ch == ')' && open_ch == '(' || ch == '}' && open_ch == '{' || ch == ']' && open_ch == '[')) return 0;
				}
			break;
		}
	}
	if (is_empty(&s)) return 1;  // ���ÿ� ���������� ����, ����1 �Ǵ�
	else return 0;
}
int main(void)
{
	char* p = "{ A[(i + 1)] = 0; }";
	if (check_matching(p) == 1)
		printf("%s ��ȣ�˻缺��\n", p);
	else
		printf("%s ��ȣ�˻����\n", p);
	return 0;
}