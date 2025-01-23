package chapter06.lecture;

// 정적 맴버 (static) : 클래스 변수 + 정적 메소드
// 인스턴스 맴버 (non-static) : 인스턴스 변수 + 인스턴스 메소드
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
        System.out.println("local Variable : " + localVariable);
        System.out.println("Class Variable : " + staticVariable);
        // System.out.println("Instance Variable : " + instanceVariable);
    }

    // 인스턴스 메소드
    public void doMethod() {
        int localVariable = 100; // 지역 변수
        staticVariable = 200; // 클래스 변수
        instanceVariable = 300;

        // 출력
        System.out.println("local Variable : " + localVariable);
        System.out.println("Class Variable : " + staticVariable);
        System.out.println("Instance Variable : " + instanceVariable);
    }
}
