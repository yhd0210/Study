package chapter05;

public class BubbleSort {
    public static void main(String[] args) {
        int[] intArray = {5,3,2,8,7};
        PrintArray.printIntArray(ArrayBubbleSort(intArray));
    }
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    public static int[] ArrayBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {  // i는 n-1까지 반복
            for (int j = 0; j < n - i - 1; j++) {  // j는 n-i-1까지 반복
                if (arr[j] > arr[j + 1]) {
                    // arr[j]와 arr[j+1]을 swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
