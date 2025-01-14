package chapter05;

public class StringTester {
    public static void main(String[] args) {
        String s1 = null; // null 참조 (참조하지 않는다는 뜻)
        String s2 = ""; // ""(빈 문자열) 참조
        String s3 = "ABC"; // Constant String Pool에 "ABC" 생성 및 참조
        String s4 = "ABC"; // Constant String Pool에 기존에 생성된 주소 재활용
        String s5 = "ABC"; // Constant String Pool에 기존에 생성된 주소 재활용
        s5 = "XYZ"; // Constant String Pool에 "XYZ" 생성 및 참조 주소 재할당

        System.out.println("문자열 s1 = " + s1);
        System.out.println("문자열 s2 = " + s2);
        System.out.println("문자열 s3 = " + s3);
        System.out.println("문자열 s4 = " + s4);
        System.out.println("문자열 s5 = " + s5);

        System.out.println("s3와 s4는 같은 문자열 리터럴 참조" + ((s3 == s4)?"하고 있다." : "하고 있지 않다."));
    }
}
