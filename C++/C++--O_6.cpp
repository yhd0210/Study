#include <iostream>
using namespace std; //std를 사용하겠다고 선언

class Complex {
    double real;
    double imag;
public:
    Complex();
    Complex(double real, double imag);
    void showme();
    Complex operator + (Complex& c);
    Complex operator - (Complex& c);
    Complex operator * (Complex& c);
    Complex operator / (Complex& c);
    Complex operator * (double d);
};

Complex Complex::operator + (Complex& c) {
    return Complex(real + c.real, imag + c.imag);
}

Complex Complex::operator - (Complex& c) {
    return Complex(real - c.real, imag - c.imag);
}

Complex Complex::operator * (Complex& c) {
    return Complex(real * c.real - imag * c.imag, real * c.imag + imag * c.real);
}
Complex Complex::operator * (double d) {
    return Complex(real * d , imag * d);
}
Complex Complex::operator / (Complex& c) {
    Complex conju(c.real, -c.imag);
    double d = 1 / (c.real * c.real + c.imag * c.imag);

    Complex tmp(real, imag);
    tmp = tmp.operator * (conju);
    return tmp.operator* (d);
}

Complex::Complex() {
    real = imag = 0;
}

Complex::Complex(double re, double im) {
    real = re;
    imag = im;
}

void Complex::showme() {
    cout << "(" << real << ", " << imag << "i)\n";
}

int main() {
    Complex result;
    Complex c1(2, 3);
    Complex c2(3, -2);

    result.showme();
    c1.showme();
    c2.showme();

    result = c1 + c2;
    result.showme();

    result = c1 - c2;
    result.showme();

    result = c1 * c2;
    result.showme();

    result = c1 / c2;
    result.showme();
}