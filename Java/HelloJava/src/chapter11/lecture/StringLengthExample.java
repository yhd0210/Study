package chapter11.lecture;

public class StringLengthExample {
    public static void main(String[] args) {
        String snn = "7306241230123";

        int length = snn.length();

        if(length==13) {
            System.out.println("주민번호 자릿 수가 맞습니다.");
        } else {
            System.out.println("주민번호 자릿 수가 다릅니다.");
        }
    }
}
