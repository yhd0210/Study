package chapter05;

public class PrintArray {
    public static void main(String[] args) {
        int[] intArr = {1, 5, 2, 51, 52};
        printIntArray(intArr);
    }
    public static void printIntArray(int[] array){
        System.out.print("{ ");
        for (int i = 0; i<array.length; i++) {
            if (i == array.length-1) {
                System.out.print(array[i]+" ");
                break;
            }
            System.out.print(array[i] + ", ");
        }
        System.out.print("}");
    }
}
