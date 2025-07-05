package chapter07.lecture;

public class Dog extends Animal {
    String species;

    public Dog() {
        super("무명 강아지");
    }

    // 생성자
    public Dog(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    protected void makeSound() {
        System.out.println(name+"가 멍멍 짖습니다.");
    }

    @Override
    protected void move() {
        System.out.println(name+"가 뛰어다닙니다.");
    }
}
