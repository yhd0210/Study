package chapter06.lecture;

// 정적 멤버(static) : 클래스 변수 + 정적 메소드
// 인스턴스 멤버(non-static) : 인스턴스 변수 + 인스턴스 메소드
public class Scope {
    // 클래스 변수
    public static int staticVariable;
    
    // 인스턴스 변수
    public int instanceVariable;
    
    // 정적 메소드
    public static void doStaticMethod() {
        int localVariable = 100; // 지역 변수
        staticVariable = 200; // 클래스 변수
        // instanceVariable = 300;

        // 출력
        System.out.println("지역 변수: " + localVariable);
        System.out.println("클래스 변수: " + staticVariable);
        // System.out.println("인스턴스 변수: " + instanceVariable);
    }


    // 인스턴스 메소드
    public void doMethod() {
        int localVariable = 100; // 지역 변수
        staticVariable = 200; // 클래스 변수
        instanceVariable = 300; // 인스턴스 변수

        // 출력
        System.out.println("지역 변수: " + localVariable);
        System.out.println("클래스 변수: " + staticVariable);
        System.out.println("인스턴스 변수: " + instanceVariable);
    }
}
