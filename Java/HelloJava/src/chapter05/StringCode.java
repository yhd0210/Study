package chapter05;

import java.util.Scanner;

public class StringCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 str : ");
        String str = sc.next();
        for (int i=0;i<str.length();i++){
            System.out.printf("str[%d] = %c %4x \n",i, str.charAt(i), (int)str.charAt(i));
        }
    }
}
