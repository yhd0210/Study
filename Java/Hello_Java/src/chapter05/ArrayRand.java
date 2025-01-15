package chapter05;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class ArrayRand {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            int num;
            boolean tf;
            do {
                num = 1 + rand.nextInt(45); // 1 ~ 45의 난수 생성
                tf = true;
                for (int j = 0; j < i; j++) {
                    if (array[j] == num) {
                        tf = false;
                        break;
                    }
                }
            } while (!tf);
            array[i] = num;
        }
        Arrays.sort(array);
        PrintArray.printIntArray(array);

//        HashSet<Integer> set = new HashSet<Integer>();
//        while(set.size() != 7) {
//            set.add(1+ rand.nextInt(45));
//        }
    }
}