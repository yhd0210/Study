import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<Bank> bankDb = new ArrayList<>();
    static List<Bank> userBanks;

    static {
        bankDb.add(new Bank("ryu",  "11111111", 100000));
        bankDb.add(new Bank( "dam", "11111234", 100000));
        bankDb.add(new Bank("yhd",  "12341111", 100000));
        bankDb.add(new Bank("yhd", "12341234", 100000));
    }

    String userName;
    BankList bank;
    String account;
    int balance;

    Bank(String userName,  String account, int balance){
        this.userName = userName;
        this.account = account;
        this.balance = balance;
    }

    public BankList getBank() {
        return bank;
    }

    public static boolean searchAccount(String account) {
        for (Bank bank : Bank.bankDb) {
            if (bank.getAccount().equals(account)){
                return false;
            }
        }
        return true;
    }

    public static List<Bank> searchBankUser(String userName) {
        List<Bank> userBanks = new ArrayList<>();
        for (Bank bank : Bank.bankDb) {
            if (bank.getUserName().equals(userName)) {
                userBanks.add(bank);
            }
        }
        if (userBanks.isEmpty()) {
            System.out.println("해당 사용자 이름을 가진 계좌를 찾을 수 없습니다.");
        }
        return userBanks;
    }

    public static List<Bank> getBankDb() {
        return bankDb;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccount() {
        return account;
    }

    public String getUserName() {
        return userName;
    }
}
