package chapter04.lecture;

public class SwitchNoBreakCase {
    public static void main(String[] args) {
        int time = (int) (Math.random()*4)+8;
        System.out.println("[현재 시각 : "+time+"시]");

        switch (time){
            case 8:
                System.out.println("출근합니다.");
                break;
            case 9:
                System.out.println("회의를 합니다.");
                break;
            case 10:
                System.out.println("업무를 본디ㅏ.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
        }
    }
}
