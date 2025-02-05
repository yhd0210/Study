package practice.example.entity;

import practice.example.entity.base.BaseEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User extends BaseEntity {

    private static long counter = 0;

    public static List<User> USER_LIST = new ArrayList<>();

    static {
        USER_LIST.add(new User("홍길동","010-0000-0001"));
        USER_LIST.add(new User("나영희","010-0000-0002"));
        USER_LIST.add(new User("김철수","010-0000-0003"));
        USER_LIST.add(new User("김영수","010-0000-0004"));
    }

    {
        this.id = ++counter;
    }

    private String name;

    private String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber= phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;

        return Objects.equals(name, user.name) && Objects.equals(phoneNumber, user.phoneNumber);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
