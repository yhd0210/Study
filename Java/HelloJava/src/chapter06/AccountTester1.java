package chapter06;

public class AccountTester1 {
    public static void main(String[] args) {
        Day d = new Day(2010, 10, 15);
        Account gildongAccount = new Account("홍길동", "0125768", 100, d);

        Day p = gildongAccount.getOpenDay();
        System.out.println("계좌 개설일:" + p);

        // 개설일을 변경한다?
        p.set(1999, 12, 31);

        Day q = gildongAccount.getOpenDay();

        System.out.println("계좌 개설일:" + q);
    }
}
