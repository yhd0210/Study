package chapter12.lecture;

class AutoSaveThrad extends Thread {
    public void save() {
        System.out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
            save();
        }
    }
}

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThrad autoSaveThrad = new AutoSaveThrad();
        autoSaveThrad.setDaemon(true);
        autoSaveThrad.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        System.out.println("메인 쓰레드 종료");
    }
}
