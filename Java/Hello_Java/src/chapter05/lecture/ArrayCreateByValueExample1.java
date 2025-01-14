package chapter05.lecture;

public class ArrayCreateByValueExample1 {
    public static void main(String[] args) {
        int[] scores = {83, 90, 87}; // new 연산자를 쓰지 않고 Heap에 생성

        System.out.println("scores[0] = " + scores[0]);
        System.out.println("scores[1] = " + scores[1]);
        System.out.println("scores[2] = " + scores[2]);
        System.out.println(scores); // 데이터 타입 (배열), 해시코드

        int sum = 0;

        for (int i = 0; i < scores.length; i ++){
            sum += scores[i];
        }

        System.out.println("배열의 길이 : " + scores.length);
        System.out.println("총합 : " + sum);
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
