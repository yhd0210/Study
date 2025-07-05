package chapter11.lecture;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer obj1 = Integer.valueOf(100);
        Integer obj2 = Integer.valueOf("200");
        Integer obj3 = Integer.valueOf("300");

        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}
