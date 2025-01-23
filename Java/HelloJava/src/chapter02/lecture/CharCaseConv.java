package chapter02.lecture; // package 선언

public class CharCaseConv { // Class 선언
    public static void main(String[] args) { // main method(실헹부)

        // 변수 선언
        char ch1 = 'a'; // Ascii code 97
        char ch2 = 'A'; // Ascii code 65
        char ch3 = (char) (ch1 - 30); // Ascii code 67
        // char ch4 = -1  *char은 음수 대입 불가*
        char ch4 = '한';
        char ch5 = '\uD55C';

        // 출력문
        System.out.println("ch1 출력 : " + ch1);
        System.out.println("'a' -> int형 형변환 후 출력 : " + (int)ch1);
        System.out.println("Ascii code 97 -> char형 형변환 : " + (char)97);
        System.out.println();

        System.out.println("ch2 출력 : " + ch2);
        System.out.println("'A' -> int형 형변환 후 출력 : " + (int)ch2);
        System.out.println("Ascii code 65 -> char형 형변환 : " + (char)65);
        System.out.println();

        System.out.println("ch3 출력 : " + ch3);
        System.out.println("'C' -> int형 형변환 후 출력 : " + (int)ch3);
        System.out.println("Ascii code 67 -> char형 형변환 : " + (char)67);
        System.out.println();

        System.out.println(ch4);
        System.out.println(ch5);
    }
}
