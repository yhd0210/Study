package chapter04.lecture;

public class SwitchCharExample {
    public static void main(String[] args) {
        char membershipGrade = 'B';
        switch (membershipGrade){
            case 'A':
            case 'a':
                System.out.println("우수회원입니다.");
                break;
            case 'B':
            case'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
        }
    }
}
