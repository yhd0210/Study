package chapter11.lecture;

public class ValueCompareExample {
    public static void main(String[] args) {

        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;

        System.out.println("== 결과 : " + (obj1 == obj2));
        System.out.println("언박싱 후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과 : " + obj1.equals(obj2));
        System.out.println();

        System.out.println("[-128~127 범위값일 경우]");
        obj1 = 10;
        obj2 = 10;

        System.out.println("== 결과 : " + (obj1 == obj2));
        System.out.println("언박싱 후 == 결과 : " + (obj1.intValue() == obj2.intValue()));
        System.out.println("equals() 결과 : " + obj1.equals(obj2));
        System.out.println();
    }
}
