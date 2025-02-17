package chapter09.lecture;

import java.util.Collections;
import java.util.Comparator;

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<Apple>();
        FruitBox<Grape> grapeBox = new FruitBox<Grape>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 100));
        grapeBox.add(new Grape("GreenGrape", 400));

        System.out.println("---- 정렬 전 ----");
        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println("---- 정렬 후 ----");
        Collections.sort(appleBox.getList(), new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.weight - o2.weight;
            }
        });
        Collections.sort(grapeBox.getList(), ((o1, o2) -> o1.weight - o2.weight));

        System.out.println(appleBox);
        System.out.println(grapeBox);

        System.out.println("---- 한번 더 ----");
        Collections.sort(appleBox.getList(), new FruitCompDesc());
        Collections.sort(grapeBox.getList(), new FruitCompAsc());

        System.out.println(appleBox);
        System.out.println(grapeBox);
    }
}
