package chapter08.lecture;

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + " 시작");
        method();
        System.out.println(Thread.currentThread() + " 종료");
    }

    static void method() {
        // 방법 1 : 직접 Thread 클래스를 상속받아 재정의
        class DownloadThread extends Thread {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for(int i = 0; i <= 100; i += 10) {
                    System.out.println("다운로드1 쓰레드 " + i + "%");
                }
            }
        }

        Thread thread1 = new DownloadThread();
        thread1.start();

        // 방법 2 : Runnable 인터페이스를 구현한 익명 객체 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread());
                for (int i = 0; i <= 100 ; i+=10) {
                    System.out.println("다운로드2 쓰레드 " + i + "%");
                }
            }
        });

        thread2.start();

        // 방법 3 : lambda (함수형 인터페이스)
        Thread thread3 = new Thread(() -> {
            System.out.println(Thread.currentThread());
            for (int i = 0; i <= 100; i+=10) {
                System.out.println("다운로드3 쓰레드 " + i + "%");
            }
        });

        thread3.start();

        System.out.println("Method 종료");
    }
}
