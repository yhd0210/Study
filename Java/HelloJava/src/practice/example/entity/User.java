package practice.example.entity;

public class User {

    private String name;

    private String phoneNumber;

    public User(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber= phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this==o) return true;
        if(!(o instanceof User user)) return false;

        return name.equals(user.name) && phoneNumber.equals(user.phoneNumber);
    }

}
