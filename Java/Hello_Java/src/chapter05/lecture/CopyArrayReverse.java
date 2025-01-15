package chapter05.lecture;

import chapter05.PrintArray;

import java.util.Scanner;

public class CopyArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = sc.nextInt();
        int[] oldArray = new int[n];
        int[] newArray = new int[n];
        int cnt = n;

        for(int i = 0; i < oldArray.length; i++){
            System.out.print("a["+i+"] = ");
            oldArray[i] = sc.nextInt();
        }
        for(int i = 0; i < oldArray.length; i++){
            cnt--;
            newArray[i] = oldArray[cnt];
        }

        System.out.println("oldArray의 모든 요소를 역순으로 복사했습니다.");
        PrintArray.printIntArray(newArray);
    }
}
