package chapter04.lecture;

public class WhileSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0, i = 1;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("1 ~ " + (i-1) + "의 합 : " + sum );
    }
}
