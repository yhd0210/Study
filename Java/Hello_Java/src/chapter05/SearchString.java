package chapter05;

import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 s1:");
        String s1 = sc.next();
        System.out.print("문자열 s2:");
        String s2 = sc.next();
        //s1이 s2 포함되어 있는가? 포함되어 있으면 그 시작 위치는?
        int idx = s1.indexOf(s2); // fullstr 기준으로 .indexOf() 호출
        if(idx==-1){
            System.out.println("s1 안에 s2가 포함돼 있지 않습니다.");
        } else {
            System.out.println(s1);
            for (int i = 0; i < idx; i++){
                System.out.print(" ");
            }
            System.out.println(s2);
        }
    }
}
