package chapter11.lecture;

public class StringReplaceExample {
    public static void main(String[] args) {
        String oldStr = "자바는 객체지향 언어 입니다.";
        String newStr = oldStr.replace("자바", "Java");

        System.out.println(oldStr);
        System.out.println(newStr);
    }
}
