package chapter05;

import java.util.Scanner;

public class ArrayClone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a["+i+"] = ");
            inputArray[i] = sc.nextInt();
        }

        int[] cloneArray = arrClone(inputArray);

        PrintArray.printIntArray(inputArray);
        System.out.println();
        PrintArray.printIntArray(cloneArray);

    }
    public static int[] arrClone(int[] arr) {
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }
}
