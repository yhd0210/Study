package chapter02.lecture;

public class RangeOfVariable {
    public static void main(String[] args) {
        int value1 = 3;

        {
            int value2 = 5;
            System.out.println(value1);
            System.out.println(value2);
        }

        System.out.println(value1);
        // System.out.println(value2); // 오류 발생
    }
}
