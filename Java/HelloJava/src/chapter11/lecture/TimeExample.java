package chapter11.lecture;

public class TimeExample {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        for(int i = 0; i < 10_000_000; i++) {
            System.out.println(1);
        }

        long endTime = System.currentTimeMillis();

        double elapsedTime = (endTime - startTime) / 1000;
        System.out.println("총 수행 시간: " + elapsedTime + "초");
    }
}
