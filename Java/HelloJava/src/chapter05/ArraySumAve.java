package chapter05;

import java.util.Scanner;

public class ArraySumAve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요소 수 : ");
        int n = sc.nextInt();
        double[] array = new double[n];

        for(int i = 0; i < n; i++) {
            System.out.print("a["+i+"] = ");
            array[i] = sc.nextDouble();
        }
        // PrintArray.printDoubleArray(array);
        double sum = 0;
        for (double point : array){
            sum += point;
        }
        System.out.println("모든 요소의 합은 "+ sum +"입니다.");
        System.out.println("모든 요소의 평균은 "+ sum/n +"입니다.");
    }
}
