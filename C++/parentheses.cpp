#include<stdio.h>
#include<stdlib.h>
#include<string.h>
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

int check_matching(char* in)
{
	StackType s;
	char ch, open_ch;
	int i, n = strlen(in);  	// n에는 문자열의 길이가 입력됨
	init_stack(&s);			// 스택의 초기화

	for (i = 0; i < n; i++) {
		ch = in[i];		// ch = 다음 문자
		switch (ch) {
			case '(':case'[':case'{':
				push(&s, ch);
				break;
			case ')':case']':case'}':
				if (is_empty(&s)) return 0; // 조건 2 판단
				else { 
					open_ch = pop(&s); 
					if (!(ch == ')' && open_ch == '(' || ch == '}' && open_ch == '{' || ch == ']' && open_ch == '[')) return 0;
				}
			break;
		}
	}
	if (is_empty(&s)) return 1;  // 스택에 남아있으면 오류, 조건1 판단
	else return 0;
}
int main(void)
{
	char* p = "{ A[(i + 1)] = 0; }";
	if (check_matching(p) == 1)
		printf("%s 괄호검사성공\n", p);
	else
		printf("%s 괄호검사실패\n", p);
	return 0;
}