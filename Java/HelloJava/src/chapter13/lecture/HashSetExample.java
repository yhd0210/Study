package chapter13.lecture;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Member {

    String name;
    int age;

    public Member(String name, int i) {
        this.name = name;
        this.age = i;
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return age == member.age && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<String>();

        set1.add("Java");
        set1.add("JDBC");
        set1.add("Servlet/JSP");
        set1.add("iBatis");

        int size = set1.size();
        System.out.println("총 객체 수: " + size);

        Iterator<String> iterator = set1.iterator();

        while(iterator.hasNext()) {
            String element = iterator.next();
            System.out.println("\t" + element);
        }

        set1.remove("JDBC");
        set1.remove("iBatis");
        System.out.println();

        for (String element : set1) {
            System.out.println("\t" + element);
        }
        System.out.println();

        set1.clear();
        System.out.println(set1);

        if (set1.isEmpty()) {
            System.out.println("비어 있음");
        }

        Set<Member> set2 = new HashSet<Member>();

        set2.add(new Member("홍길동", 30));
        set2.add(new Member("홍길동", 30));

        System.out.println(set2);
        System.out.println("총 객체 수 : " + set2.size());

    }
}
