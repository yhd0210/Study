package practice.bluemarble;
import practice.bluemarble.exception.BankruptPlayerViolation;
import practice.bluemarble.exception.PlayerHasNoMoneyViolation;

import java.util.Scanner;

public class Player extends Payable {
    private String playerName;

    private int loanCount;

    public Player(String PlayerName){
        this.playerName = PlayerName;
        this.loanCount = 0;
        this.cash = 10_000;
    }

    public String getPlayerName() {
        return playerName;
    }

    @Override
    protected void minusAmount(int amount) throws PlayerHasNoMoneyViolation {
        if(this.cash<amount) {
            throw new PlayerHasNoMoneyViolation(playerName);
        } else {
            super.minusAmount(amount);
        }
    }
    protected  void loan(){
        loanCount ++;
        if (loanCount > 4) {
            throw new BankruptPlayerViolation(playerName);
        } else {
            this.cash = 10_000;
        }
    }
    public void payAmountTo(Payable receiver, int amount) {
        try {
            minusAmount(amount);
            receiver.plusAmount(amount);
        } catch (PlayerHasNoMoneyViolation e) {
            Scanner sc = new Scanner(System.in);
            System.out.println("대출을 수행하시겠습니까? y/n");

            if("y".equals(sc.nextLine())) {
                loan();
                payAmountTo(receiver, amount);
            } else {
                payAllAssetsTo(receiver);
                throw new BankruptPlayerViolation(playerName);
            }
        }
    }
}
