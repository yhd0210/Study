package chapter05;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {
    public static void main(String[] args) {
        // 배열을 섞기 전에 사용자에게 입력을 받아보자
        // 스캐너 객체 선언
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] array;

        // 배열 길이 입력 받기
        System.out.print("배열의 길이를 입력 : ");
        int n = sc.nextInt();

        // 입력 받은 길이 만틈 배열 생성하기 ( int[] )
        array = new int[n];

        // 생성한 배열을 순환(Loop)하며 입력을 받기
        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            array[i] = sc.nextInt();
        }

        // 배열에 있는 값들을 섞기
        for (int i = array.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        // 출력하기
        System.out.println("요소를 섰었습니다.");
        PrintArray.printIntArray(array);
    }
}
