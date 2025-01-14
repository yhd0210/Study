package chapter05;

import java.util.Scanner;

public class StringCompareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 s1:");
        String s1 = sc.next();
        System.out.print("문자열 s2:");
        String s2 = sc.next();

        int balance = s1.compareTo(s2);
        System.out.println(balance);

        System.out.println(s1+" / "+s2);

        if (balance < 0){
            System.out.println("s1이 작다. s1, s2순으로 출력할때 오름차순");
        } else if (balance > 0){
            System.out.println("s2이 작다. s1, s2순으로 출력할때 내림차순");
        } else {
            System.out.println("s1과 s2가 같다.");
        }
    }
}
