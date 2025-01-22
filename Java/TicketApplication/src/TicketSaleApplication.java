public class TicketSaleApplication {
    public static void main(String[] args) {
        // 티켓 객체 생성, 매표소 객체 생성
        // Ticket, TicketOffice
        TicketOffice itSchoolTicketOffice = new TicketOffice(100_000L,
                new Ticket(8_000L),
                new Ticket(8_000L),
                new Ticket(8_000L),
                new Ticket(8_000L),
                new Ticket(8_000L));


        // 판매원 객체 생성, 아이티스쿨 소극장 객체 생성
        // TicketSeller, Theater | 순서 : 매표소 -> 티켓 셀러 -> 소극장

        TicketSeller ticketSeller = new TicketSeller(itSchoolTicketOffice);
        Theater itSchoolTheater = new Theater(ticketSeller);

        // 관람객 객체 생성
        // Audience
        Audience audience1 = new Audience(new Bag(50_000L));
        Audience audience2 = new Audience(new Bag(new Invitation(), 10_000L));

        // 관람객 입장
        itSchoolTheater.enter(audience1);
        itSchoolTheater.enter(audience2);

    }
    // 소프트웨어 모듈이 가져야 하는 세 가지 기능
    // 1. 실행 중에 제대로 동작한다.
    // 2. 변경을 위해 존재한다.
    // (대부분의 모듈은 쓰여지는 동안 변경되기 때문에 간단한 작업만으로도 변경이 가능해야 한다)
    // 3. 코드를 읽는 사람과 의사소통한다.
    // (모듈은 특별한 훈련 없이도 개발자가 쉽게 이해해할 수 있어야 한다.
    // 읽는 사람과 의사소통 할수 없는 모듈은 개선해야 한다.)
}
