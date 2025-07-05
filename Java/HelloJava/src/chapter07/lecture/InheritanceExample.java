package chapter07.lecture;

public class InheritanceExample {
    public static void main(String[] args) {
        // Dog 객체 생성
        Dog dog1 = new Dog("맥스", "골든 리트리버");

        System.out.println("동물의 이름 : " + dog1.name);
        System.out.println("동물의 이름 : " + ((Animal)dog1).name);
        System.out.println("동물의 종류(품종) : " + dog1.species);
        System.out.println();

        // 부모와 자식에 똑같은 변수명을 써서 혼란을 일으킴
        // name hiding
        Animal dog2 = new Dog("맥스", "골든 리트리버");
        System.out.println("동물의 이름 : " + dog2.name);
        System.out.println("동물의 이름 : " + ((Dog) dog2).name);
    }
}
