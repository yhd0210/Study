package chapter02.lecture;

public class StackExample {

    static int classVariable = 5; // 클래스 변수 (메서드 영역, 프로그램 시작시 단 한번 적재, 종료 시 제거)

    public static void main(String[] args) {
        int mainVariable = 10; // main method의 지역 변수
        System.out.println("Main Method Start" + mainVariable);

        someMethod(); // 다른 메서드를 호출

        System.out.println("Main Method End");
    }

    public static void someMethod(){
        int methodVariable = 20; // someMethod의 지역 변수
        System.out.println("Some Method Start" + methodVariable + " 클래스 변수 : " + classVariable);

        anotherMethod();

        System.out.println("Some Method End");
    }

    public static void anotherMethod(){
        int anotherVariable = 30; // anotherMethod의 지역 변수
        System.out.println("Another Method Start" + anotherVariable + " 클래스 변수 : " + classVariable);
        System.out.println("Another Method End");
    }

}
