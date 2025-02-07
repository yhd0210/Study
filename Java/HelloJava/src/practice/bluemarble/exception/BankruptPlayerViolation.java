package practice.bluemarble.exception;

public class BankruptPlayerViolation extends RuntimeException {
    public BankruptPlayerViolation(String playerName) {
        super(playerName + "님이 파산하셨습니다.");
    }
}
