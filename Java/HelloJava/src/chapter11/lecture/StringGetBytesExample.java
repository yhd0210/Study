package chapter11.lecture;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class StringGetBytesExample {
    // 종종 문자열을 바이트 배열로 변환하는 경우가 있음
    // 예를 들어 네트워크로 문자열을 전송하거나, 문자열을 암호화할 때
    // 윈도우 인코딩 : EUC-KR(window 949) 알파벳은 1바이트, 한글은 2바이트로 변환
    // UTF-8은 알파벳은 1바이트, 한글은 3바이트로 변환
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "안녕하세요";

        byte[] byte1 = str.getBytes();
        System.out.println("byte1.length = " + byte1.length);
        System.out.println("Default Charset = " + Charset.defaultCharset().displayName());
        
        String str1 = new String(byte1);
        System.out.println("byte1 -> String : " + str1);
        System.out.println("Default Charset = " + Charset.defaultCharset().displayName());
    
        // 네트워크 전송자 시점
        byte[] byte2 = str.getBytes("EUC-KR");
        System.out.println("byte2.length = " + byte2.length);

        // 네트워크 수신자 시점
        String str2 = new String(byte2, "EUC-KR");
        System.out.println("byte2->String(EUC-KR) : " + str2);

        // 네트워크 전송자 시점
        byte[] byte3 = str.getBytes(StandardCharsets.UTF_8);
        System.out.println("byte3.length = " + byte3.length);

        // 네트워크 수신자 시점
        String str3 = new String(byte3, StandardCharsets.UTF_8);
        System.out.println("byte3->String(UTF-8) : " + str3);

    }
}
