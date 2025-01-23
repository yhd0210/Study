package chapter05;

import java.util.Scanner;

public class ArrayInsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a["+i+"] = ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스 : ");
        int idx = sc.nextInt();
        System.out.print("삽입할 요소 : ");
        int n = sc.nextInt();

        int[] rmvArray = arrInsOf(inputArray, idx, n);

        System.out.print("요소 삽입 전 배열 >> ");
        PrintArray.printIntArray(inputArray);
        System.out.println();
        System.out.print("요소 삽입 후 배열 >> ");
        PrintArray.printIntArray(rmvArray);

    }
//    private static int[] arrInsOf2(int[] arr, int idx, int n) {
//        int arrIndex = arr.length;
//
//    }

    private static int[] arrInsOf(int[] inputArray, int idx, int num) {
        int n = inputArray.length + 1;
        int[] newArray = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if (i == idx) {
                newArray[i] = num;
                cnt --;
            } else {
                newArray[i] = inputArray[cnt];
            }
            cnt++;
        }
        return newArray;
    }
}
