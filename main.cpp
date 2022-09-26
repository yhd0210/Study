#include "Heap.h"

int main(void) {
    element dat[]{ 69,10,30,2,16,8,31,22,6,3,9,5,7,1,9 };
    int cnt = sizeof(dat) / sizeof(element);
    HeapType Heap(cnt);
    Heap.creatHeap();

    printf("\n 입 력 자 료:\t"); p_out(dat, cnt);
    printf("\n\n Heap Tree:\n");
    for (int a = 0; a < cnt; a++) {
        Heap.insertHeap(dat[a]);
        Heap.printHeap();
    }
    printf("\n Delete Heap:\n");
    for (int a = 1; a <= cnt; a++) {
        printf("\n Delete Value: %d\n", Heap.deleteHeap());
        Heap.printHeap();
    }
}