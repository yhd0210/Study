package chapter07;

public class AnimalTester {
    public static void main(String[] args) {
//        Animal animal = new Animal("원숭이"){
//            @Override
//            public void bark() {
//                System.out.println("우끼끼");
//            }
//        };

        Animal[] animals = new Animal[2];

        animals[0] = new Dog("초코", "치와와");
        animals[1] = new Cat("나비", 7);

        for(Animal animal : animals) {
            animal.introduce();
            System.out.println();
        }
    }
}
