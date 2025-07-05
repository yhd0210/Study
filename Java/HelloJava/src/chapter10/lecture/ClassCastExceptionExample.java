package chapter10.lecture;

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();

        changeDog(dog);

        Cat cat = new Cat();
        changeDog(cat);

        System.out.println("프로그램 종료");

    }
    private static void changeDog(Animal animal) {
        // if(animal instanceof Dog)
            Dog dog = (Dog) animal; // ClassCatException 발생
    }
}
