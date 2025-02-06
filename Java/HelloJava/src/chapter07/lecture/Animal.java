package chapter07.lecture;

// 추상 클래스 정의
public abstract class Animal {
    protected String name; // 지어준 이름

    protected Animal() {}

    protected Animal(String name) {
        this.name = name;
    }

    public void makeSoundWHileMoving() {
        move();
        makeSound();
    }

    // 추상 메소드 정의 (구현을 강제)
    // 추상 메소드가 최소 1개 이상이라면 추상 클래스로 변경 필요
    abstract protected void makeSound();
    abstract protected void move();
}
