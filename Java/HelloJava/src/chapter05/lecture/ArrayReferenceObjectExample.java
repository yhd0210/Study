package chapter05.lecture;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];

        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println(strArray[0]==strArray[1]);
        System.out.println(strArray[2]==strArray[1]);

        // 인덱스 1번과 인덱스 2번의 내용을 비교 ( 주소값 비교 x )
        System.out.println(strArray[1].equals(strArray[2]));
    }
}
