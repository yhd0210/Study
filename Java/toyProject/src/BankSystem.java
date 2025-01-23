import java.util.*;

public class BankSystem {
    public static boolean login(String userName, String userPW) {
        for (User user : userDb) {
            if (user.userName.equals(userName) && user.userPW.equals(userPW)) {
                System.out.println("로그인 성공! 환영합니다, " + userName + "님.");
                return true;
            }
        }
        System.out.println("로그인 실패: 사용자 이름 또는 비밀번호가 잘못되었습니다.");
        return false;
    }

    public static boolean register() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("회원가입을 진행합니다.");
        System.out.print("사용자 이름을 입력하세요: ");
        String newUserName = scanner.nextLine();
        for (User user : userDb) {
            if (user.userName.equals(newUserName)) {
                System.out.println("이미 존재하는 사용자 이름입니다. 다른 이름을 선택하세요.");
                return false;
            }
        }
        System.out.print("비밀번호를 입력하세요: ");
        String newUserPW = scanner.nextLine();
        System.out.print("전화번호를 입력하세요: ");
        String newUserPhone = scanner.nextLine();
        String newAccount;
        userDb.add(new User(newUserName, newUserPW, newUserPhone));
        System.out.println(newUserName + "님, 회원가입이 완료되었습니다.");
        return true;
    }

    public static void checkBalance(String userName) {
        for (User user : userDb) {
            if (user.userName.equals(userName)) {
                System.out.println(userName + "님의 잔액은 " + user.balance + "원입니다.");
                return;
            }
        }
        System.out.println("계좌 정보를 찾을 수 없습니다.");
    }

    public static void deposit(String userName, int amount) {
        for (User user : userDb) {
            if (user.userName.equals(userName)) {
                user.balance += amount;
                System.out.println(amount + "원이 입금되었습니다. 현재 잔액: " + user.balance + "원");
                return;
            }
        }
        System.out.println("계좌 정보를 찾을 수 없습니다.");
    }

    public static void withdraw(String userName, int amount) {
        for (User user : userDb) {
            if (user.userName.equals(userName)) {
                if (user.balance >= amount) {
                    user.balance -= amount;
                    System.out.println(amount + "원이 출금되었습니다. 현재 잔액: " + user.balance + "원");
                } else {
                    System.out.println("잔액이 부족합니다.");
                }
                return;
            }
        }
        System.out.println("계좌 정보를 찾을 수 없습니다.");
    }

    public static void transfer(String senderName, String recipientAccount, int amount) {
        User sender = null;
        User recipient = null;
        for (User user : userDb) {
            if (user.userName.equals(senderName)) {
                sender = user;
            }
            if (user.account.equals(recipientAccount)) {
                recipient = user;
            }
        }
        if (sender == null) {
            System.out.println("송신자 계좌 정보를 찾을 수 없습니다.");
            return;
        }
        if (recipient == null) {
            System.out.println("수취인 계좌번호를 찾을 수 없습니다.");
            return;
        }
        if (sender.balance >= amount) {
            sender.balance -= amount;
            recipient.balance += amount;
            System.out.println(amount + "원이 " + recipient.userName + "님의 계좌로 송금되었습니다. 현재 잔액: " + sender.balance + "원");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 은행 시스템 ===");

        while (true) {
            System.out.print("사용자 이름을 입력하세요: ");
            String userName = scanner.nextLine();
            System.out.print("비밀번호를 입력하세요: ");
            String userPW = scanner.nextLine();
            String choice = "";

            if (login(userName, userPW)) {
                while (true) {
                    System.out.println("\n1. 잔액 조회");
                    System.out.println("2. 입금");
                    System.out.println("3. 출금");
                    System.out.println("4. 송금");
                    System.out.println("5. 로그아웃");
                    System.out.println("6. 종료");
                    System.out.print("원하는 작업을 선택하세요: ");
                    choice = scanner.nextLine();
                    switch (choice) {
                        case "1":
                            checkBalance(userName);
                            break;
                        case "2":
                            System.out.print("입금할 금액을 입력하세요: ");
                            int depositAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            deposit(userName, depositAmount);
                            break;
                        case "3":
                            System.out.print("출금할 금액을 입력하세요: ");
                            int withdrawAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            withdraw(userName, withdrawAmount);
                            break;
                        case "4":
                            System.out.print("수취인 계좌번호를 입력하세요: ");
                            String recipientAccount = scanner.nextLine();
                            System.out.print("송금할 금액을 입력하세요: ");
                            int transferAmount = scanner.nextInt();
                            scanner.nextLine(); // Clear buffer
                            transfer(userName, recipientAccount, transferAmount);
                            break;
                        case "5":
                            System.out.println("로그아웃되었습니다.");
                            break;
                        case "6":
                            System.out.println("종료합니다.");
                            break;
                        default:
                            System.out.println("잘못된 선택입니다. 다시 시도하세요.");
                    }

                    if (choice.equals("6")||choice.equals("5")) {
                        break;
                    }
                }
            } else {
                System.out.println("1. 다시 로그인");
                System.out.println("2. 회원가입");
                System.out.print("원하는 작업을 선택하세요: ");
                String retryChoice = scanner.nextLine();
                if (retryChoice.equals("2")) {
                    if (register()) {
                        System.out.println("이제 다시 로그인해주세요.");
                    }
                } else if (!retryChoice.equals("1")) {
                    System.out.println("잘못된 선택입니다. 프로그램을 종료합니다.");
                    break;
                }
            }
            if (choice.equals("6")) {
                break;
            }
        }
        scanner.close();
    }
}