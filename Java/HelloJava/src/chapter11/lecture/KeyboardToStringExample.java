package chapter11.lecture;

import java.io.IOException;

public class KeyboardToStringExample {
    public static void main(String[] args) throws IOException {
        byte[] bytes = new byte[100];

        System.out.print("입력:");
        int readByteNumber = System.in.read(bytes);

        String str = new String(bytes, 0, readByteNumber-1);
        System.out.println(str);
    }
}
