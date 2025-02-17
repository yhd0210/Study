package chapter13.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> map = new HashMap<>();

        map.put("spring", "12");
        map.put("summer", "123");
        map.put("fall", "1234");
        map.put("winter", "12345");

        while(true) {
            System.out.println("아이디와 비밀번호를 입력해주세요.");
            System.out.print("아이디 : ");
            String id = sc.nextLine();

            System.out.print("비밀번호 : ");
            String password = sc.nextLine();
            System.out.println();

            if(map.containsKey(id)) {
                if (map.get(id).equals(password)) {
                    System.out.println("로그인 되었습니다.");
                    break;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다.");
                }
            } else {
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }
        }
    }
}
