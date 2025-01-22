public class TicketSeller {
    // 자신이 일하고 있는 매표소를 알고 잇어야 함
    private TicketOffice ticketOffice;
    // 외부에서는 절대 접근 할 수 없음

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        Ticket ticket = ticketOffice.getTicket();
        System.out.println(audience.buy(ticket));
    }
}
