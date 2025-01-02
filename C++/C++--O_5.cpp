#include <iostream>
using namespace std;

class MyTime {
	int hh, mm, ss;//Ω√,∫–,√ 
	int tss;
public:
	MyTime();
	MyTime(int h, int m, int s);
	void showme();
	MyTime Cvt_S2H(int n);
	MyTime operator + (MyTime t);
	MyTime operator - (MyTime t);
	MyTime operator * (int n);
	friend MyTime operator * (int n, MyTime t);
	MyTime operator / (int n);
};
int main() {
	MyTime result;
	MyTime t1(7, 29, 48); t1.showme();
	MyTime t2(4, 54, 39); t2.showme();

	result = t1 + t1 + t1; result.showme();
	result = t2 - t1 + t1; result.showme();
	result = t1 * 3; result.showme();
	result = 3 * t1; result.showme();
	result = t2 / 4; result.showme();
	result = result.Cvt_S2H(300); result.showme();
}
MyTime::MyTime() {
	hh = mm = ss = tss = 0;
}
MyTime::MyTime(int h, int m, int s) {
	hh = h; mm = m; ss = s;
	tss = h * 60 * 60 + m * 60 + s;
}
void MyTime::showme() {
	cout.width(3); cout << hh << " :";
	cout.width(3); cout << mm << " :";
	cout.width(3); cout << ss << " :";
	cout.width(3); cout << tss << endl;
}
MyTime MyTime::Cvt_S2H(int tt) {
	tt = abs(tt);
	MyTime result(tt / 60 / 60, tt / 60 % 60, tt % 60);
	return result;
}
MyTime MyTime::operator + (MyTime t) {
	return Cvt_S2H(tss + t.tss);
}
MyTime MyTime::operator - (MyTime t) {
	return Cvt_S2H(tss - t.tss);
}
MyTime MyTime::operator * (int n) {
	return Cvt_S2H(tss * n);
}
MyTime operator * (int n, MyTime t) {
	return t * n;
}
MyTime MyTime::operator / (int n) {
	return Cvt_S2H(tss / n);
}