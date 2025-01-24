import java.util.ArrayList;
import java.util.List;

public class User {
    private static List<User> userDb = new ArrayList<>();

    static {
        userDb.add(new User("dam", "1111", "010-0000-0001"));
        userDb.add(new User("ryu", "1234", "010-0000-0002"));
        userDb.add(new User("yhd", "qwer1234", "010-0000-0003"));
    }

    private String userName;
    private String userPW;
    private String phone;

    public User(String userName, String userPW, String phone) {
        this.userName = userName;
        this.userPW = userPW;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserPW() {
        return userPW;
    }

    public String getPhone() {
        return phone;
    }

    public static List<User> getUserDb() {
        return userDb;
    }
}
