package chapter10.lecture;

import java.util.Scanner;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        try {
            parseAndAdd(s1, s2);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("프로그램 종료");
        }
    }
    public static void parseAndAdd(String s1, String s2) throws NumberFormatException {
        int value1 = Integer.parseInt(s1);
        int value2 = Integer.parseInt(s2);

        System.out.println(add(value1, value2));
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }
}
