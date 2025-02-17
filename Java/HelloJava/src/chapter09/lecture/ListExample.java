package chapter09.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3));
        List<Character> charList = new ArrayList<>(Arrays.asList('삼', '이', '일'));
        List<String> strList = new ArrayList<>(Arrays.asList("삼삼", "이이", "일일"));
        List<Boolean> booleanList = new ArrayList<>(Arrays.asList(false, true, true));

        System.out.println(getFristFromList(intList));
        System.out.println(getFristFromList(charList));
        System.out.println(getFristFromList(strList));
        System.out.println(getFristFromList(booleanList));
    }

    private static <T>  T getFristFromList(List<? extends T> list) {
        return list.get(0);
    }
}
