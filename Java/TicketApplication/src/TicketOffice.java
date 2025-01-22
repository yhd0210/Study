import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TicketOffice {
    private Long amount;

    // 보유한 티켓들
    private List<Ticket> tickets = new ArrayList<>();

    // ...은 Ticket 타입의 가변 길이 매개변수로, 0개 이상의 Ticket 객체를 전달할 수 있음
    // 이 값들은 내부적으로 배열로 처리됨
    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    // 티켓 발급하여 return
    public Ticket getTicket() {
        return tickets.remove(0);
    }

    // 보유 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    // 보유 현금 증가
    public void plusAmont(Long amount) {
        this.amount += amount;
    }

    // 보요 현금 return
    public Long getAmount() {
        return amount;
    }
}
