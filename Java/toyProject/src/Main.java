public class Main {
    public static void main(String[] args) {
        while (true) {
            User user = null;

            // 로그인 또는 회원가입 성공 시 User 객체 반환
            while (user == null) {
                user = UserService.startSystem();
            }

            // 메인 서비스 페이지
            while (true) {
                if (!UserService.userServicePage(user)) {
                    System.out.println("로그아웃되었습니다. 로그인 또는 회원가입 페이지로 돌아갑니다.");
                    break; // 로그아웃 시 내부 루프 종료, 외부 루프에서 다시 로그인/회원가입 실행
                }
            }
        }
    }
}
