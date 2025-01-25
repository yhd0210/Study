import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<Bank> bankDb = new ArrayList<>();
    static List<Bank> bankUserDb = new ArrayList<>();

    static {
        bankDb.add(new Bank("ryu", BankList.신한은행, "11111111", 100000));
        bankDb.add(new Bank( "dam",BankList.국민은행, "11111234", 100000));
        bankDb.add(new Bank("yhd", BankList.농협, "12341111", 100000));
    }

    String userName;
    BankList bank;
    String account;
    int balance;

    Bank(String userName, BankList bank, String account, int balance){
        this.userName = userName;
        this.bank = bank;
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

    public static Bank searchBankUser(String userName) {
        for (Bank bank : Bank.bankDb) {
            if (bank.getUserName().equals(userName)) {
                return bank;
            }
        }
        System.out.println("해당 사용자 이름을 가진 계좌를 찾을 수 없습니다.");
        return null;
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
