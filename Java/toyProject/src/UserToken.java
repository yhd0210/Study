import java.util.ArrayList;
import java.util.List;

public class UserToken {
    private static List<UserToken> userTokens = new ArrayList<>();

    private String userName;
    private boolean token;

    public UserToken(String userName, boolean token) {
        this.userName = userName;
        this.token = token;
    }

    public String getUserName() {
        return userName;
    }

    public boolean getUserToken() {
        return token;
    }

    public static List<Bank> searchBankUser(String userName) {
        List<Bank> userBanks = new ArrayList<>();
        for (Bank bank : Bank.getBankDb()) {
            if (bank.getUserName().equals(userName)) {
                userBanks.add(bank);
            }
        }
        if (userBanks.isEmpty()) {
            System.out.println("해당 사용자 이름을 가진 계좌를 찾을 수 없습니다.");
        }
        return userBanks;
    }

    public static List<UserToken> getUserTokensDb() {
        return userTokens;
    }

}
