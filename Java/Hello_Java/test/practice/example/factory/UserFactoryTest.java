package practice.example.factory;

//import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import practice.example.entity.User;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

class UserFactoryTest {

    @Test
    void from(){
        List<User> userList = UserFactory.getUsers();

        userList.clear();

        int countBefore = userList.size();

        User user1 = UserFactory.from("홍길동", "010-0000-0006");
        User user2 = UserFactory.from("홍길동", "010-0000-0006");

        int countAfter = userList.size(); // 길이 1이 되야함

        assertThat(countAfter).isEqualTo(countBefore+1);
        assertThat(user1).isSameAs(user2);
    }
}