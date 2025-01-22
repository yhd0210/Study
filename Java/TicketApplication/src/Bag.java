public class Bag {
    // 현금
    private Long amount;

    // 초대장
    private Invitation invitaion;

    // 티켓
    private Ticket ticket;

    // 현금 필드 초기화 생성자
    public Bag(long amount) {
        this(null, amount);
    }

    // 초대장과 현금 필드 초기화 생성자
    public Bag(Invitation invitation, long amount) {
        this.invitaion = invitation;
        this.amount = amount;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean HasInvitation() {
        return invitaion != null;
    }

    //
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 보유 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
