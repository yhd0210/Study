#include <iostream>
using namespace std;

int main()
{
    // bool 선언
    bool b0 = 0 == 0;
    bool b1 = 0 < 1;
    bool b2 = 0 > 1;

    // 1 ------------------------------------------------------------------
    std::cout << "bool 출력" << std::endl;
    std::cout << "b0 : " << b0 << std::endl;
    std::cout << "b1 : " << b1 << std::endl;
    std::cout << "b2 : " << b2 << std::endl;
    std::cout << std::endl;

    // 2 ------------------------------------------------------------------
    std::cout << "bool 출력을 true, false로 하도록 변경" << std::endl;
    std::cout.setf(std::ios_base::boolalpha);
    std::cout << "b0 : " << b0 << std::endl;
    std::cout << "b1 : " << b1 << std::endl;
    std::cout << "b2 : " << b2 << std::endl;
    std::cout << std::endl;

    // 3 ------------------------------------------------------------------
    std::cout << "bool과 if" << std::endl;
    if (b0)
        std::cout << "b0" << std::endl;
    if (b1)
        std::cout << "b1" << std::endl;
    if (b2)
        std::cout << "b2" << std::endl;
    std::cout << std::endl;

    // 4 ------------------------------------------------------------------
    std::cout << "bool 에서 정수로 형 변환" << std::endl;
    int itrue = true;
    int ifalse = false;

    std::cout << itrue << std::endl;
    std::cout << ifalse << std::endl;
    std::cout << std::endl;

    // 5 ------------------------------------------------------------------
    std::cout << "정수에서 bool로 형 변환" << std::endl;
    bool btrue = 100;
    bool bfalse = 0;

    std::cout << btrue << std::endl;
    std::cout << bfalse << std::endl;
    return 0;
}