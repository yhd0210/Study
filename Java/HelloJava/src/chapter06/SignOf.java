package chapter06;

import java.awt.datatransfer.SystemFlavorMap;
import java.util.Scanner;

public class SignOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수 : ");
        int x = sc.nextInt();

        char sign = signOf(x);
        System.out.println(sign);

    }
    public static char signOf(int n) {
        char sign = '0';
        if(n>0) {
            sign = '+';
        }
        else if (n < 0) {
            sign = '-';
        }

        return sign;
    }
}
