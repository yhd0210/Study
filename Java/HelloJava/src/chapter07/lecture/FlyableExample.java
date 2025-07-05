package chapter07.lecture;

abstract class Animal_ {}

interface Flyable{
    void  fly();
}

class Duck extends Animal_ implements Flyable {
    @Override
    public void fly() {
        System.out.println("오리가 날개를 퍼덕이며 날아갑니다.");
    }
}

class Goose extends Animal_ implements Flyable {
    @Override
    public void fly() {
        System.out.println("기러기가 우아하게 날개짓하며 날아갑니다.");
    }
}

public class FlyableExample {
    public static void main(String[] args) {
        Flyable duck = new Duck();
        Flyable goose = new Goose();

        duck.fly();
        goose.fly();

        method1(duck);
        method1(goose);

        method2(duck);
        method2(goose);

    }

    public static void method1(Flyable flyable) {
        if(flyable instanceof  Duck) {
            Duck duck = (Duck) flyable;
            System.out.println("method1 : 오리로 변환 성공");
        }
    }

    public static void method2(Flyable flyable) {
        // ClassCastException 발생 가능성 : Duck이 아니라 Goose instance일 때
        Duck duck = (Duck) flyable;
        System.out.println("method2 : 오리로 변환 성공");
    }
}
