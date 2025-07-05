package chapter07;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 템플릭 메서드 패턴
    public void introduce() {
        System.out.println(toStr() + "이다. ");
        bark();
    }

    public abstract void bark();
    public abstract String toStr();
}
