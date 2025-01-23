package chapter05;

public class PrintArrayVariable {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("a = " + a); // 객체를 구별하기 위한 해시코드

        //a = null;

        PrintArray.printIntArray(a);

        a[0] = 10;

        PrintArray.printIntArray(a);

        final double PI_OF_CIRCLE = 3.14;

        double PI = Math.PI;
    }
}
