package chapter02;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args){
        Random rand = new Random();

        // rand.nextInt(N) || 난수 범위 offset ~ N-1 + offset
        // 난수를 생성한다. 0부터 N-1까지 N개의 난수 생성
        // 0부터 시작하므로 인간 사고에는 직관적이지 않다.
        int n1 = rand.nextInt(9); // 0 ~ 8
        System.out.println("임의의 정수 값은 "+ n1);

        // 한 자리의 양의 정수 ( 1 ~ 9 )
        int n2 = rand.nextInt(1,10);
        System.out.println("한 자리의 정수 값은 " + n2);

        // 두 자리의 양의 정수 ( 10 ~ 99 )
        int n3 = rand.nextInt(10, 100);
        System.out.println("두 자리의 정수 값은 " + n3);

        int n3_1 = rand.nextInt(90)+10;
        System.out.println(n3_1);

        // 문제 : 한자리의 음의 정수 ( -1 ~ -9 )
        int n4 =  rand.nextInt(9)-9;    //rand.nextInt(-9, 0);
        System.out.println("한 자리의 음의 정수는 " + n4);
    }
}
