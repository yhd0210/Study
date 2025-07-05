package chapter10.lecture;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        //System.out.println(data.toString());

        if("유효한 데이터".equals(getDBData())) {
            System.out.println("성공");
        }

        System.out.println("프로그램 종료");;
    }

    public static String getDBData() {

        return null;
    }
}
