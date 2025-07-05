package chapter11.lecture;

public class StringTrimExample {
    public static void main(String[] args) {
        String tel1 = "   02";
        String tel2 = "1     23  ";
        String tel3 = "    1234    ";

        String tel = tel1.trim() + "-" + tel2.replace(" ", "") + "-" + tel3.trim();
        System.out.println(tel);
    }
}
