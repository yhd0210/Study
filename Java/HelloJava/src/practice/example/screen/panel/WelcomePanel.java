package practice.example.screen.panel;

import practice.example.entity.User;
import practice.example.screen.frame.BaseFrame;
import practice.example.service.UserService;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Pattern;

public class WelcomePanel extends JPanel {
    BaseFrame baseFrame;

    UserService userService = UserService.getInstance();

    // Component, 구성 요소
    JLabel $userNameLabel;
    JTextField $userNameField;

    JLabel $phoneNumberLabel;
    JTextField $phoneNumberField;

    JButton $nextButton;

    private WelcomePanel() {}

    public WelcomePanel(BaseFrame baseFrame) {
        baseFrame.setTitle("초기화면");
        this.baseFrame = baseFrame;

        this.setLayout(new GridLayout(3, 4));

        $userNameLabel = new JLabel("이름(한글 2~4자)");
        $userNameLabel.setVerticalAlignment(SwingConstants.CENTER);
        $userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        $userNameField = new JTextField();

        $phoneNumberLabel = new JLabel("휴대전화");;
        $phoneNumberLabel.setVerticalAlignment(SwingConstants.CENTER);
        $phoneNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
        $phoneNumberField = new JTextField();

        $nextButton = new JButton("좌석 선택");

        this.add($userNameLabel);
        this.add($userNameField);
        this.add($phoneNumberLabel);
        this.add($phoneNumberField);
        this.add($nextButton);

        $nextButton.addActionListener(e -> {
            String name = $userNameField.getText();
            String phoneNumber = $phoneNumberField.getText();

            if(validateNameAndPhoneNumber(name, phoneNumber)) {
                // 해당 이름과 전화번호로 사용자 검색
                User user = userService.checkMember(name, phoneNumber);

                baseFrame.currentUser = user;

                System.out.println(user);

                // 다음 좌석 선택 페이지로 넘어가기
                baseFrame.changePanel(new SeatSelectionPanel(baseFrame));
            }
        });
    }

    // 한글 이름 검증, 전화번호 검증
    private boolean validateNameAndPhoneNumber(String name, String phoneNumber) {
        if(!Pattern.matches("^[가-힣]{2,4}$", name)) {
            JOptionPane.showMessageDialog(null, "이름을 한글 2~4자로 입력");
            return false;
        }

        if(!Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", phoneNumber)) {
            JOptionPane.showMessageDialog(null, "핸드폰 번호를 정확히 입력하세요.");
            return false;
        }

        return true;
    }
}
