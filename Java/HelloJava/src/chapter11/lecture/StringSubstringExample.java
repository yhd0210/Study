package chapter11.lecture;

public class StringSubstringExample {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }

    static String subStr(String src, int startIndex, int endIndex) {
        StringBuilder sb = new StringBuilder();

        for(int i = startIndex; i < endIndex; i++ ) {
            sb.append(src.charAt(i));
        }

        return sb.toString();
    }
}
