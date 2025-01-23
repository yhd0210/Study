package chapter02;

import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시/도 : ");
        String address = sc.next();
        System.out.println("첫 번째 입력하신 주소는 " + address + "입니다.");
        System.out.println();

        sc.nextLine(); // 버퍼에서 개행 제거용

        System.out.print("시/군/구 : ");
        address = sc.nextLine();
        System.out.println("두 번째 입력하신 주소는 " + address + "입니다.");
        System.out.println();

    }
}
