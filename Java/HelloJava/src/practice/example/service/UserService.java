package practice.example.service;

import practice.example.entity.User;

import java.util.List;

public class UserService {
    // region Singleton
    private static UserService instance;

    private UserService() {}

    public static UserService getInstance() {
        if(instance == null)
            instance = new UserService();

        return instance;
    }
    // endregion

    // 회원 목록
    List<User> userList = User.USER_LIST;

    public User checkMember(String name, String phoneNumber) {
        // 회원 정보가 있는지 확인하고 없으면 회원에 추가
        User findUser;

        try {
            findUser = findUserByNameAndPhoneNumber(name, phoneNumber);
            System.out.println("유저 찾기 성공");
        } catch (RuntimeException e) { // 유저 찾기 실패 시
            findUser = createUser(name, phoneNumber);
            System.out.println("유저 생성 성공");
        }

        return findUser;
    }

    private User createUser(String name, String phoneNumber) {
        User entity = new User(name, phoneNumber);

        userList.add(entity);

        return entity;
    }

    private User findUserByNameAndPhoneNumber(String name, String phoneNumber) {
        User entity = new User(name, phoneNumber);

        for(User user: userList)
            if(entity.equals(user))
                return user;

        throw new RuntimeException("해당 유저 찾기 실패");
    }

}
