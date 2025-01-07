package chapter03;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("변수 A : ");
        int a = sc.nextInt();

        System.out.println("변수 B : ");
        int b = sc.nextInt();

        boolean isMultiple = (a%b==0);

        String result = isMultiple? "A는 B의 배수입니다.":"A는 B의 배수가 아님니다.";

        System.out.println(result);
    }
}
