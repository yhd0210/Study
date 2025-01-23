package chapter05.lecture;

import chapter05.PrintArray;

public class ArrayCopyExample {
    public static void main(String[] args) {
        String[] oldStrArray = {"Java", "array", "copy"};

        String[] newStrArray = new String[5];

        System.arraycopy(oldStrArray, 0,newStrArray,0,oldStrArray.length);

        PrintArray.printStringeArray(newStrArray);
    }
}
