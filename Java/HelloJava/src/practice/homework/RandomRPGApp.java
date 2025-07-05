package practice.homework;

import practice.homework.entity.RandomCharacter;

import java.util.Scanner;

public class RandomRPGApp {

    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("당신의 이름은? : ");
        String playerName = scanner.nextLine();

        System.out.println("용사여.... 당신은");

        RandomCharacter myCharacter = RandomCharacter.roleCharacter(playerName);

        System.out.println(myCharacter);

        boolean isRunning = true;

        while (isRunning) {
            // 메뉴 표시
            System.out.println("===== 게임 메뉴 =====");
            System.out.println("1. 모험");
            System.out.println("2. 휴식");
            System.out.println("3. 종료");
            System.out.print("메뉴를 선택하세요: ");

            // 사용자 입력 받기
            int choice = scanner.nextInt();

            // 입력 처리
            switch (choice) {
                case 1:
                    System.out.println("모험을 시작합니다!");
                    // 모험 로직 추가
                    break;
                case 2:
                    System.out.println("휴식을 취합니다...");
                    // 휴식 로직 추가
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    isRunning = false; // 루프 종료
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 선택하세요.");
            }

            System.out.println(); // 출력 간격 조정
        }

        scanner.close();
    }
}
