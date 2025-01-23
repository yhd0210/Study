package chapter04;

import java.util.Scanner;

public class Min3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("실수 3개 입력 : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double min = 0;
        if(Math.min(a,b)>=c){
            min = c;
        } else if (Math.min(a,c)>b){
            min = b;
        } else if (Math.min(b,c)>a){
            min = a;
        }
        System.out.println("min = " + min);
    }
}
