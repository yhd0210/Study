package practice.bluemarble;

import practice.bluemarble.exception.BankruptPlayerViolation;
import practice.bluemarble.exception.PlayerHasNoMoneyViolation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>(Arrays.asList(new Player("player1"),
                new Player("player2"),
                new Player("player3")));

        Random random = new Random();

        while(playerList.size() != 1) {
            int payIndex = random.nextInt(3);
            int receiverIndex = random.nextInt(3);

            if(payIndex == receiverIndex) {
                System.out.println("자기 자신한테 줄 수 없습니다.");
            } else {
                Player pay = playerList.get(payIndex);
                Player receiver = playerList.get(receiverIndex);

                System.out.println("------------------- Before -------------------");
                System.out.println(pay.getPlayerName() + "님의 보유 금액 : " + pay.getCash());
                System.out.println(receiver.getPlayerName() + "님의 보유 금액 : " + receiver.getCash());
                System.out.println("----------------------------------------------");

                System.out.println(pay.getPlayerName() + "님이 " + receiver.getPlayerName() + "에게 1500원을 줍니다.");

                try {
                    pay.payAmountTo(receiver, 4_500);
                } catch (BankruptPlayerViolation e) {
                    System.out.println(e.getMessage());
                    playerList.remove(pay);
                }

                System.out.println("------------------- After -------------------");
                System.out.println(pay.getPlayerName() + "님의 보유 금액 : " + pay.getCash());
                System.out.println(receiver.getPlayerName() + "님의 보유 금액 : " + receiver.getCash());
                System.out.println("----------------------------------------------");
            }
        }
        System.out.println(playerList.get(0).getPlayerName() + "가 우승하였습니다.");
    }
}
