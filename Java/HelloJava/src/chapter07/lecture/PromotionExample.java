package chapter07.lecture;

class A {}

class B extends A {} // A의 자식
class C extends B {} // B의 자식

class D extends A {} // A의 자식
class E extends D {} // B의 자식

public class PromotionExample {
    public static void main(String[] args) {
        B varB = new B();
        C varC = new C();
        D varD = new D();
        E varE = new E();

        A aB = varB;
        A aC = varC;

        A aD = varD;
        A aE = varE;

        B bC = varC;
        D dE = varE;

        // 상속이 직속 관계인 경우에만 캐스팅(형변환)이 가능
        // 할아버지 <-> 아버지 : 가능!
        // 삼촌 <-> 조카, 사촌 지간 : 불가능!
        // B bE = varE; // 삼촌 <-> 조카, 직속이 아님

        // C cE = varE; // 사촌지간
    }
}
