package chapter11.lecture;

public class ExitExample {
    public static void main(String[] args) {
        for (int i  = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5) {
                System.exit(0);
                break;
            }
        }

        System.out.println("프로그램 종료");
    }
}
