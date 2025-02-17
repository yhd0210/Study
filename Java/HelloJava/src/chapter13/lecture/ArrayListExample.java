package chapter13.lecture;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "Database");
        list.add("iBatis");

        int size = list.size();
        System.out.println("총 객체 수 : " + size);
        System.out.println();

        String oneOfSkill = list.get(2);
        System.out.println("2: " + oneOfSkill);
        System.out.println();

        for (int i = 0; i < size; i ++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        }
        System.out.println();

        list.remove(2);
        list.remove(2);
        list.remove("iBatis");

        System.out.println(list);

    }
}
