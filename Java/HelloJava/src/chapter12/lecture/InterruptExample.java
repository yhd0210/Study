package chapter12.lecture;

class PrintThread2 extends Thread {
    boolean stop;

    @Override
    public void run() {
        while (true) {
            System.out.println("실행 중");

            if (this.isInterrupted()) break;
        }
    }
}

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread2();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}

        thread.interrupt();
    }
}
