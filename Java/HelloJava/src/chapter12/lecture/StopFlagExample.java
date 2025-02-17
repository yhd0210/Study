package chapter12.lecture;

class PrintThread1 extends Thread {
    boolean stop = false;

    @Override
    public void run() {
        while (!stop) {
            System.out.println("실행 중");
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }

    public void setStop(boolean b) {
        this.stop = b;
    }
}

public class StopFlagExample {
    public static void main(String[] args) {
        PrintThread1 printThread1 = new PrintThread1();
        printThread1.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e ) {}

        printThread1.setStop(true);
    }
}
