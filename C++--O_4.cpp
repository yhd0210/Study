#include <iostream>
using namespace std;

void Cvt_S2H(int ss, int* h, int* m, int* s);
int Cvt_H2S(int h, int m, int s);

int main() {
	int h1 = 7, m1 = 49, s1 = 52;
	int h2 = 4, m2 = 32, s2 = 20;
	int hh, mm, ss;
	int ss1, ss2, ssp;

	ss1 = Cvt_H2S(h1, m1, s1);
	ss2 = Cvt_H2S(h2, m2, s2);

	Cvt_S2H(ss1 + ss2, &hh, &mm, &ss);
	printf("A + B + %d : %d : %d\n", hh, mm, ss);

	Cvt_S2H(ss2 - ss1, &hh, &mm, &ss);
	printf("A - B = %d : %d : %d\n", hh, mm, ss);

	Cvt_S2H(ss1 * 3, &hh, &mm, &ss);
	printf("A * 3 = %d : %d : %d\n", hh, mm, ss);

	Cvt_S2H(ss1 / 3, &hh, &mm, &ss);
	printf("A / 3 = %d : %d : %d\n", hh, mm, ss);
}

int Cvt_H2S(int h, int m, int s) {
	int ssp = h * 60 * 60 + m * 60 + s;
	return ssp;
}

void Cvt_S2H(int ssp, int* hh, int* mm, int* ss) {
	ssp = abs(ssp);
	*hh = ssp / 60 / 60;
	*mm = ssp / 60 % 60;
	*ss = ssp % 60;
}