package chapter06;

import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 : ");
        int x = sc.nextInt();
        System.out.print("y값 : ");
        int y = sc.nextInt();
        System.out.print("z값 : ");
        int z = sc.nextInt();

        System.out.println("x, y의 최소값은 " + min(x,y) + "입니다.");
        System.out.println("x, y, z의 최소값은 " + min(x,y,z) + "입니다.");
    }
    public static int min(int x, int y) {
        return (x < y) ? x: y;
    }
    public static int min(int x, int y, int z) {
        int min = (x < y) ? x: y;
        return (min < z) ? min: z;
    }
}
