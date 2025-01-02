#include <iostream>
using namespace std;

int main()
{
    int a = 3, b(7), c(b << 2);
    int ar[10] = { 1,2,3,4,5,6,7,8,9,10 };
    int* br[2];

    for (int k = 0; k < 2; k++) {
        br[k] = &ar[k * 5];
    }
    for (int l = 0; l < 2; l++) {
        for (int m = 0; m < 5; m++) {
            cout << br[l][m] << " ";
        }
        cout << endl;
    }
}
