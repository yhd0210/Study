package chapter07.lecture;

public class MyClassExample {
    public static void main(String[] args) {
        System.out.println("1)--------------------------");

        MyClass myClass1 = new MyClass(); // rc = new Television(); 으로 초기화
        myClass1.rc.turnOn();
        myClass1.rc.setVolume(5);

        System.out.println("2)--------------------------");
        MyClass myClass2 = new MyClass(new Audio());

        System.out.println("2)--------------------------");
        MyClass myClass3 = new MyClass();
        myClass3.methodA();

        System.out.println("2)--------------------------");
        MyClass myClass4 = new MyClass();
        myClass4.methodB(new Television());


    }
}
