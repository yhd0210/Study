public class TicketSeller {
    // 자신이 일하고 있는 매표소를 알고 잇어야 함
    private TicketOffice ticketOffice;
    // 외부에서는 절대 접근 할 수 없음

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        if(audience.getBag().HasInvitation()) {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().setTicket(ticket);
            System.out.println("초대장이 있어 입장합니다.");
        } else {
            Ticket ticket = ticketOffice.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketOffice.plusAmont(ticket.getFee());
            audience.getBag().setTicket(ticket);
            System.out.println("티켓 구매후 입장 합니다.");
        }
    }
}
