package chapter05;

import java.security.KeyStore;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int num = sc.nextInt();

        int[] intArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x["+i+"]:");
            intArray[i] = sc.nextInt();
        }

        System.out.print("찾는 값:");
        int key = sc.nextInt();

        int idxMin = linearSearchL(intArray, key);
        int idxMax = linearSearchR(intArray, key);

        if (idxMin == -1) {
            System.out.println("해당 값은 존재하지 않습니다.");
        } else if (idxMax == idxMin) {
            System.out.println("해당 값은 x["+idxMin+"]에 있습니다.");
        } else {
            System.out.println("해당 값의 요소가 여러개 존재합니다.");
            System.out.println("가장 앞에 위치한 값은 x["+idxMin+"]에 있습니다.");
            System.out.println("가장 뒤에 위치한 값은 x["+idxMax+"]에 있습니다.");
        }
    }
    public static int linearSearchL(int[] arr, int key) {
        int place = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                place = i;
                break;
            }
        }
        return place;
    }
    public static int linearSearchR(int[] arr, int key) {
        int place = -1;
        for (int i = arr.length - 1 ; i > 0; i--) {
            if (arr[i] == key) {
                place = i;
                break;
            }
        }
        return place;
    }
}
