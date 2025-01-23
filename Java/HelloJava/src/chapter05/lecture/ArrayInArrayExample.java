package chapter05.lecture;

import java.util.Scanner;

public class ArrayInArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] testScores;

        // 변수 입력
        System.out.print("학생 수를 입력을 하세요 >> ");
        int x = sc.nextInt();
        System.out.print("한 학기의 시험 수를 입력해 주세요 >> ");
        int y = sc.nextInt();
        System.out.print("과목 이름을 말해주세요 >> ");
        String subject = sc.next();

        testScores = new int[x][y];
        // 점수 입력
        testScores = insertIntArrayByTwoDimension(testScores);

        System.out.println("--------------- 표 형태로 출력 ---------------");
        printIntArrayByTwoDimension(testScores);
        //System.out.println("---------------- 한 줄씩 출력 ----------------");
        //printIntArray(testScores, subject);
    }

    public static int[][] insertIntArrayByTwoDimension(int[][] inputArray) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int rowLength = inputArray.length; // 행 길이
        int colLength = inputArray[0].length; // 열 길이
        int sum = 0;

        // 배열 선언
        int[][] newArray = new int[rowLength][colLength + 1];
        int[] newColumn = new int[rowLength];

        // 점수 입력
        for(int i = 0; i < rowLength; i++) {
            System.out.print("학생 "+i+"\n");
            for(int j = 0; j < colLength; j++) {
                System.out.printf("시험 점수%2d : ", j+1);
                inputArray[i][j] = sc.nextInt();
            }
        }

        // 기존 데이터를 복사
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                newArray[i][j] = inputArray[i][j];
                sum += inputArray[i][j];
            }
            newColumn[i] = sum / colLength;
            sum = 0;
            newArray[i][colLength] = newColumn[i];
        }

        return newArray;
    }

    public static void printIntArrayByTwoDimension(int[][] inputArray) {
        int rowLength = inputArray.length; // 행 길이
        int colLength = inputArray[0].length; // 열 길이

        // 열 헤더 출력
        System.out.printf("%6s", " ");
        for (int col = 0; col < colLength; col++) {
            if(col==colLength-1) {
                System.out.printf("%6s", "Avg");
                break;
            }
            System.out.printf("%6s", "UserFactoryTest" + col);
        }
        System.out.println();

        // 행 데이터 출력
        for (int row = 0; row < rowLength; row++) {
            System.out.printf("%6s", "stud" + row);
            for (int col = 0; col < colLength; col++) {
                System.out.printf("%6d", inputArray[row][col]);
            }
            System.out.println();
        }
    }

    public static void printIntArray(int[][] intArray, String subject) {
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.println(subject+"scores[" + i + "][" + j + "] = " + intArray[i][j]);
            }
        }
    }
}