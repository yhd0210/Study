package chapter06;

import java.util.Scanner;

public class PrintSesson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (true){
            System.out.print("몇 월 입니까? (1~12) : ");
            x = sc.nextInt();
            if (x<=12 && x > 0) {
                System.out.println("해당 월의 계절은 " + printSesson(x) + "입니다.");
                break;
            }
        }
    }
    public static String printSesson(int m) {
        String sesson = "";
        switch (m){
            case(3): case(4): case(5):
                sesson = "봄";
                break;
            case(6): case(7): case(8):
                sesson = "여름";
                break;
            case(9): case(10): case(11):
                sesson = "가을";
                break;
            case(12): case(1): case(2):
                sesson = "겨울";
                break;
            default:
                break;
        }
        return sesson;
    }
}
