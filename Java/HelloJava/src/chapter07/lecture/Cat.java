package chapter07.lecture;

public class Cat extends Animal{
    public Cat(){
        super("무명 고양이");
    }

    @Override
    protected void makeSound() {
        System.out.println(name+"가 야옹합니다.");
    }

    @Override
    protected void move() {
        System.out.println(name + "가 살금살금 걷습니다.");
    }
}
