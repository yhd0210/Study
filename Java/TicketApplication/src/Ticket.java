public class Ticket {
    // 티켓 가격
    private Long fee;

    public Long getFee() {
        return fee;
    }

    public Ticket() {}

    public Ticket(Long fee) {
        this.fee = fee;
    }

}
