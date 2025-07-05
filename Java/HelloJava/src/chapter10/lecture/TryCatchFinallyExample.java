package chapter10.lecture;

public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            // 예외 발생 가능 코드가 위치함
            // 예외 없이 정상 실행되면 catch 블록의 코드는 실행되지 않음
            // 예외가 발생하면 즉시 실행을 멈추고 catch 블록으로 이동하여 코드 실행
            Class clazz = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            // 예외 처리
            System.out.println("클래스가 존재하지 않습니다.");
        } finally {
            // 항상 실행
            // 예외 여부와는 상관없이 항상 실행할 내용이 있을 경우에 작성
            // 심지어 try, catch 블곡에서 return문을 사용하더라도 finally 블록은 항상 실행됨
            System.out.println("main 메소드 내 finallu 블록 실행 종료");
        }
    }
}
