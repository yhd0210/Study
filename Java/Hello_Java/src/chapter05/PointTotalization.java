package chapter05;

import java.util.Scanner;
// 1. 6명의 두 과목(국어, 수학) 점수로부터 과목별/학생별 평균
// 2. 위 주석의 코드가 완성되면 6명 고정이 아니라 Scanner로 동적으로 n을 입력받아 학생수 결정
// 3. 학생수 : n * 과목 2개 = 2n 만큼 for 문이 반복 필요
public class PointTotalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        final int subjectNumber = 2; // 과목 수 (국어, 수학)
        int peopleNum;
        String[] subjectNameArray = {"국어", "수학"};

        // 학생 수 입력
        System.out.print("학생 수 >> ");
        peopleNum = sc.nextInt();

        // 2차원 배열 선언
        int[][] scores = new int[peopleNum][subjectNumber];

        // 점수 입력 및 평균 계산
        double[][] newArray = insertIntArrayByTwoDimension(scores, subjectNameArray);

        // 결과 출력
        printDoubleArrayByTwoDimension(newArray, subjectNameArray);
    }

    public static double[][] insertIntArrayByTwoDimension(int[][] inputArray, String[] subjectName) {
        Scanner sc = new Scanner(System.in);

        int rowLength = inputArray.length; // 학생 수
        int colLength = inputArray[0].length; // 과목 수
        int checkNum = 0; // 0~100사이에 수인지 확인

        // 평균 행과 열을 포함한 새로운 배열 생성
        double[][] newArray = new double[rowLength + 1][colLength + 1];

        // 점수 입력
        for (int i = 0; i < rowLength; i++) {
            System.out.println("학생 " + (i + 1));
            for (int j = 0; j < colLength; j++) {
                while (true) {
                    System.out.print(subjectName[j] + " 점수: ");
                    checkNum = sc.nextInt();
                    if (checkNum >= 0 && checkNum <= 100) {
                        break;
                    }
                    else {
                        System.out.println("0~100까지의 수를 다시 입력하세요.");
                    }
                }
                inputArray[i][j] = checkNum;
                newArray[i][j] = inputArray[i][j];
            }
        }

        // 학생별 평균 계산 및 마지막 열에 추가
        for (int i = 0; i < rowLength; i++) {
            int sum = 0;
            for (int j = 0; j < colLength; j++) {
                sum += inputArray[i][j];
            }
            newArray[i][colLength] = sum / (double) colLength; // 평균 저장
        }

        // 과목별 평균 계산 및 마지막 행에 추가
        for (int j = 0; j < colLength; j++) {
            int sum = 0;
            for (int i = 0; i < rowLength; i++) {
                sum += inputArray[i][j];
            }
            newArray[rowLength][j] = sum / (double) rowLength; // 평균 저장
        }
        // 마지막 행과 마지막 열에 빈 칸 (0.0) 처리
        newArray[rowLength][colLength] = 0.0;

        return newArray;
    }

    public static void printDoubleArrayByTwoDimension(double[][] inputArray, String[] subjectName) {
        int rowLength = inputArray.length; // 행 길이
        int colLength = inputArray[0].length; // 열 길이

        // 열 헤더 출력
        System.out.printf("%6s", "학생");
        for (int col = 0; col < colLength - 1; col++) {
            System.out.printf("%8s", subjectName[col]);
        }
        System.out.printf("%8s", "평균");
        System.out.println();

        // 행 데이터 출력
        for (int row = 0; row < rowLength - 1; row++) {
            System.out.printf("%6s", "학생" + (row + 1));
            for (int col = 0; col < colLength; col++) {
                if (col == colLength - 1) {
                    System.out.printf("%10.2f", inputArray[row][col]);
                } else {
                    System.out.printf("%9d", (int) inputArray[row][col]);
                }
            }
            System.out.println();
        }
        // 마지막 행 (과목별 평균) 출력
        System.out.printf("%5s", "과목 평균");
        for (int col = 0; col < colLength - 1; col++) {
            System.out.printf("%9.2f", inputArray[rowLength - 1][col]);
        }
        System.out.println();
    }
}