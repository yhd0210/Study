package chapter05;

import java.util.Scanner;

public class LinearSearchTop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int n = sc.nextInt();
        int[] array = new int[n];
        // 배열 요소 입력 받기
        for (int i = 0; i < n; i++){
            System.out.print("a["+i+"] = ");
            array[i] = sc.nextInt();
        }
        // PrintArray.printIntArray(array);
        System.out.print("찾을 숫자 : ");
        int key = sc.nextInt();
        int i;
        for (i = 0; i < n; i++) {
            if (array[i] == key)
                break;
        }
        if (i<n){
            System.out.println("그 값은 a["+i+"]에 있습니다.");
        } else {
            System.out.println("해당 값이 존재하지 않습니다.");
        }
    }
}
