package practice;

public class Problem_04_2 {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1;i<=100;i++){
            if (i%3==0){
                sum += i;
            }
        }
        System.out.println("1-100까지 정수 중 3의 배수의 총합 : " + sum);
    }
}
