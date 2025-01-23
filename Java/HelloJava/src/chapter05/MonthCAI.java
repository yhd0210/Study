package chapter05;
import java.util.Random;
import java.util.Scanner;

public class MonthCAI { // Computer-Assisted Instruction ( 컴퓨터 지원 교육 )
    public static void main(String[] args) {

        // 스캐너 & 랜덤 객체 생성
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 변수 선언
        int retry, monthIdx, last = -1;
        String mouth;

        // 배열 선언
        String[] monthString = {"January", "February", "March",
                                "April", "May", "June",
                                "July", "August", "September",
                                "October", "November", "December"
        }; // index 0 ~ 11

        // 입력 가이드라인
        System.out.println("해당 달의 영어 단어를 입력하시오.");
        System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하시오.");

        // 입력 & 입력값 참과 거짓 여부 확인
        do {

            // 입력
            do {
                monthIdx = random.nextInt(12);
            } while(monthIdx == last);

            // 입력값 참거짓 여부 확인
            while(true){
                System.out.print((monthIdx + 1) + "월 : ");
                mouth = sc.next();
                if (monthString[monthIdx].equals(mouth)) {
                    System.out.print("정답입니다.");
                    last = monthIdx;
                    break;
                } else {
                    System.out.println("틀렸습니다.");
                }
            }

            // 재시도 의사
            System.out.println("다시 한번? 1... Yes/ 0... No");
            retry = sc.nextInt();

        } while(retry == 1);
    }
}
