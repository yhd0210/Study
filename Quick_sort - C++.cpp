#include <iostream>
using namespace std;

int dat[] = { 6,2,9,3,8,4,5,1,10, 42, 214, 40,9999999 };

void printout(int* p, int num) {
    for (int i = 0; i < num; i++) {
        printf("%4d", p[i]);
    }
    cout << endl;
}

void swap(int high, int low) {
    int tmp = dat[high];
    dat[high] = dat[low];
    dat[low] = tmp;
}

void Quick(int* arr, int start, int fin) {
    int pivot = arr[start];
    int high, low;

    high = start;   // pivot보다 큰 것 위치
    low = fin;   // pivot보다 작은 것 위치
    if (high < low) {
        while (high < low) {
            while (arr[high] <= pivot) high++;
            while (arr[low] > pivot) low--;

            if (high < low)   swap(high, low);
            else {
                swap(start, low);
                break;
            }
        }
        //cout << arr[high] << "  " << arr[low] << endl;
        Quick(arr, start, low - 1);
        Quick(arr, low + 1, fin);
    }
}
int main() {
    int SZ = sizeof(dat) / sizeof(int);
    printout(dat, SZ-1);
    Quick(dat, 0, SZ-1);
    printout(dat, SZ-1);
}