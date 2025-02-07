package practice.bluemarble;

import practice.bluemarble.exception.BankruptPlayerViolation;
import practice.bluemarble.exception.PlayerHasNoMoneyViolation;

import java.util.Scanner;

public abstract class Payable {
    protected int cash;

    public int getCash() {
        return cash;
    }

    protected void plusAmount(int amount) {
        this.cash += amount;
    }

    protected void minusAmount(int amount) {
        this.cash -= amount;
    }

    public abstract void payAmountTo(Payable receiver, int amount);

    public void payAllAssetsTo(Payable receiver) {
        receiver.plusAmount(this.cash);
        this.cash = 0;
    }

}
