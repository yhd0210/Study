package chapter07.lecture;

public class Dog extends Animal {
    String name; // 지어준 이름을 또... 선언?

    String species;

    // 생성자
    public Dog(String name, String species) {
        this.name = name;
        this.species = species;
    }
}
