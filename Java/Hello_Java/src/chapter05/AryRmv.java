package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class AryRmv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();
        int[] inputArray = new int[num];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a["+i+"] = ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스 : ");
        int idx = sc.nextInt();

        int[] rmvArray = arrRmv(inputArray, idx);

        PrintArray.printIntArray(inputArray);
        System.out.println();
        PrintArray.printIntArray(rmvArray);

    }

    private static int[] arrRmv(int[] inputArray, int idx) {
        int n = inputArray.length - 1;
        int[] newArray = new int[n];
        int cnt = 0;
        for(int i = 0; i < inputArray.length; i++) {
            if (i == idx) {
               cnt--;
            } else {
                newArray[cnt] = inputArray[i];
            }
            cnt++;
        }
        return newArray;
    }
}
