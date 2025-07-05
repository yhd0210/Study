package chapter11.lecture;

public class StringIndexOfExample {
    public static void main(String[] args) {
        // indexOf() 메서드는 매개값으로 주어진 문자열이 시작되는 인덱스를 리턴함
        // 만약에 주어진 문자열이 포함되어 있지 않으면 -1을 리턴
        // 즉, -1을 리턴하면 특정 문자열이 포함되어 있지 않다는 뜻임
        String subject = "자바 프로그래밍";

        int startIndex = subject.indexOf("프로그래밍");
        System.out.println(startIndex);

        if(subject.indexOf("자바") != -1) {
            System.out.println("자바와 관련된 책이군요.");
        } else {
            System.out.println("자바와 관련없는 책이군요.");
        }
    }
}
