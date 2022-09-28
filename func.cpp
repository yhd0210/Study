// func.cpp

#include "Heap.h"
// Heap ������
HeapType::HeapType(int cnt) {
    heapSize = 0;
    heap = (element*)malloc(sizeof(element) * (cnt + 1));
}

// Heap �ʱ�ȭ
HeapType* HeapType::creatHeap() {
    HeapType* h = (HeapType*)malloc(sizeof(HeapType));
    return h;
}

// Heap ��� ����
void HeapType::insertHeap(element item) {
    heapSize++;

    int a = heapSize;
    while ((a != 1) && (item < heap[a / 2])) {
        heap[a] = heap[a / 2];
        a /= 2;
    }
    heap[a] = item;
}

// Heap ��� ����
element HeapType::deleteHeap() {
    element item = heap[1], tmp = heap[heapSize];
    heapSize--;

    int parent = 1, child = 2;
    while (child <= heapSize) {
        if (child < heapSize && heap[child] > heap[child + 1]) child++;
        // heapSize���� ���� child�� �� ������ child�� �ִ�.

        if (tmp > heap[child]) {
            heap[parent] = heap[child];
            parent = child;
            child = child * 2;
        }
        else break;
    }
    heap[parent] = tmp;

    return item;
}
// Heap ��� ���
void HeapType::printHeap() {
    double level = 0.; // level�� ������ ������ ���� �ٲپ� ���

    for (int a = 1; a <= heapSize; a++) {
        level = log(a) / log(2);
        switch ((int)level) {
        case 0: cout.width(32); cout << heap[a]; break;
        case 1: cout.width(16); cout << heap[a]; cout.width(16); cout << ' '; break;
        case 2: cout.width(8); cout << heap[a]; cout.width(8); cout << ' '; break;
        case 3: cout.width(4); cout << heap[a]; cout.width(4); cout << ' '; break;
        }
        level = log(a + 1) / log(2);
        if ((int)level == level) cout << endl;
    } if ((int)level != level) cout << endl;
    cout << "====================================================================\n";
}
// �Է� �ڷ� ���
void p_out(element* p, int cnt) {
    for (int a = 0; a < cnt; a++) {
        cout.width(3);
        cout << *(p + a);
    }
    cout << endl;
}
