import java.util.ArrayList;
import java.util.List;

public class Bank {
    static List<Bank> bankDb = new ArrayList<>();

    static {
        bankDb.add(new Bank("ryu", BankList.신한은행, "0123456789", 100000);
        bankDb.add(new Bank( "dam",BankList.국민은행, "0123456789", 100000));
        bankDb.add(new Bank("yhd", BankList.농협, "0123456789", 100000));
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
}
