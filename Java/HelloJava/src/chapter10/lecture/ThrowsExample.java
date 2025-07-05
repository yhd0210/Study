package chapter10.lecture;

public class ThrowsExample {
    public static void main(String[] args) { // 메인 메서드에서 떠넘기게 되면 JVM에서 알아서 처리
        try {
            findClass();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
    // throws 키워드를 사용하여 경우에 따라 메소드를 호출한 곳으로 예외를 떠넘길 수 잇음
    // 기본은 예외가 발생할때 try-catch 블록으로 예외를 처리하는 것이 기본이긴 함
    // 예시로 부루마블의 복잡한 로직 속에서 어떤 예외가 발생하게 되면
    // 게임 롤을 관장하는 클래스에 그 예외 처리를 하도록 일임할 수 있음
    // throws 키워드는 메소드 선언부 끝에 작성되며 쉼표로 구분해서 여러 예외 클래스들이 올 수 있음
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String");
    }
}
