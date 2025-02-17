package chapter09.lecture;

public class Juicer {
    static String makeJuice1(FruitBox box) {
        String tmp = "";
        for (Object fruit : box.getList()) {
            tmp += fruit + " ";
        }
        return tmp + "Juice";
    }

    static String makeJuice2(FruitBox<Fruit> box) {
        String tmp = "";
        for (Object fruit : box.getList()) {
            tmp += fruit + " ";
        }
        return tmp + "Juice";
    }
}
