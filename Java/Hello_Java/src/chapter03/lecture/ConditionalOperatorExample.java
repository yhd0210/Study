package chapter03.lecture;

public class ConditionalOperatorExample {
    public static void main(String[] args) {
        int score = 85;

        // (조건식)? true 일 때 : false일 때;
        char grade = (score > 90)?'A':((score>80)? 'B':'C');

        System.out.println(score + "점은 " + grade + "등급입니다. ");
    }
}
