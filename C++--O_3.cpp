#include <iostream>
using namespace std;

int main()
{
    int ar[12] = { 1,2,3,4,5,6,7,8,9,10,11,12 };
    int* br[3];

    for (int k = 0; k < 3; k++) {
        br[k] = &ar[k * 4];
    }
    for (int l = 0; l < 3; l++) {
        for (int m = 0; m < 4; m++) {
            cout.width(4);
            cout << br[l][m];
        }
        cout << endl;
    }
}