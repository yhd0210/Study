package practice.example.screen.panel;

import practice.example.entity.Reservation;
import practice.example.entity.Seat;
import practice.example.entity.User;
import practice.example.screen.frame.BaseFrame;
import practice.example.service.ReservationService;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;

public class SeatSelectionPanel extends JPanel {
    BaseFrame baseFrame;

    // Component, 구성요소
    ButtonGroup seatsGroup;
    JRadioButton[] $seats;

    JButton $previous;
    JButton $next;

    JLabel $digitalClock;
    Thread digitalClock;

    List<Seat> seatList = Seat.SEAT_LIST;

    private SeatSelectionPanel() {}

    public SeatSelectionPanel(BaseFrame baseFrame) {
        baseFrame.setTitle("좌석 선택");
        this.baseFrame = baseFrame;

        this.setLayout(new GridLayout(5, 5));

        $seats = new JRadioButton[seatList.size()];
        seatsGroup = new ButtonGroup();

        for (int i = 0; i < $seats.length; i++) {
            $seats[i] = new JRadioButton(seatList.get(i).getDescription());
            $seats[i].setBorderPainted(true); // 테두리 선
            $seats[i].setVerticalAlignment(SwingConstants.TOP);
            $seats[i].setVerticalTextPosition(SwingConstants.CENTER);

            seatsGroup.add($seats[i]);

            this.add($seats[i]);
        }

        $previous = new JButton("이전");

        $digitalClock = new JLabel(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd (E) HH:mm:ss")));
        $digitalClock.setHorizontalAlignment(SwingConstants.CENTER);

        digitalClock = new Thread() {
            @Override
            public void run() {
                while(true) {
                    try {
                        $digitalClock.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd (E) HH:mm:ss")));
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException("디지털 시계 사용 종료");
                    }
                }
            }
        };

        digitalClock.start();

        // 해당 멤버가 좌석 예약 중인지 체크
        boolean isExist = checkReservation();

        if(isExist) {
            $next = new JButton("좌석 이동");
            // $next.addActionListener(e -> changeSeat());
        } else {
            $next = new JButton("좌석 예약");
            $next.addActionListener(e -> reserveSeat());
        }

        this.add($previous);
        this.add($next);
        this.add($digitalClock);

        $previous.addActionListener((e) -> {
            digitalClock.interrupt();
            baseFrame.changePanel(new WelcomePanel(baseFrame));
        });


    }

    private void reserveSeat() {
        digitalClock.interrupt();

        for (int i = 0; i < $seats.length; i++) {
            int confirm;

            if($seats[i].isSelected()) {
                confirm = JOptionPane.showConfirmDialog(null,
                        $seats[i].getText()+"을 1시간 사용하시겠습니까?",
                        "Confirm",
                        JOptionPane.YES_NO_OPTION);

                if(confirm == JOptionPane.YES_OPTION) { // 예약 눌렀을때
                    if(ReservationService.getInstance().reserveSeat(i + 1L, 1L)) { // 좌석 예약 성공
                        JOptionPane.showMessageDialog(null, "좌석 배정 성공");
                    } else { // 좌석 예약 실패
                        JOptionPane.showMessageDialog(null, "좌석 배정 실패");
                    }
                    baseFrame.changePanel(new WelcomePanel(baseFrame));
                } else { // 예약 취소
                    baseFrame.changePanel(new SeatSelectionPanel(baseFrame));
                }
            }
        }
    }

    private boolean checkReservation() {
        List<Reservation> reservations = Reservation.RESERVATION_LIST;

        boolean isExist = false;
        User currentUser = BaseFrame.currentUser;

        for(Reservation reservation : reservations) {
            if(reservation.getUser().equals(currentUser)) {
                isExist = true;
            }

            int seatIndex = (int) (reservation.getSeat().getId() - 1);
            $seats[seatIndex].setEnabled(false);
            $seats[seatIndex].setVerticalTextPosition(SwingConstants.TOP);
            $seats[seatIndex].setText("<html><body>"+ reservation.getSeat().getDescription() + "<br>" + reservation.getUser().getName() + "님이 사용 중<br>" + reservation.getStartTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + "부터<br>" + reservation.getEndTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))+"까지"+"</body></html>");
            $seats[seatIndex].setToolTipText(reservation.getSeat().getDescription() + " " + reservation.getUser().getName() + "님이 사용 중 " + reservation.getStartTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")) + "부터 " + reservation.getEndTime().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"))+"까지");
        }

        return isExist;
    }
}
