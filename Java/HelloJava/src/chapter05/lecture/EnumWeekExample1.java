package chapter05.lecture;

import java.util.Calendar;

public class EnumWeekExample1 {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance(); // 싱글턴 패턴에서 단일 객체를 가져올때 쓰는 메서드
        int week = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(week); // 일요일 : 1 .... 수요일 : 4 ... 토요일 : 7
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY; // today에 힙메모리에 있는 토요일 주소값을 반환
                today = Week.valueOf("SATURDAY"); // 상수 이름의 문자열을 가지고 토요일 주소값 반환. (이름이 일치하지 않으면 예외 발생)
                break;
        }
        System.out.println("오늘 요일: " + today); // today 출력 == today.toString()
        System.out.println("ordinal: " + today.ordinal()); // 선언된 순서에 따라 0부터 시작하는 정수 인덱스 출력
        System.out.println("name: " + today.name()); // 선언된 정확한 이름을 문자열로 반환 (불변)

        if (today == Week.SUNDAY){
            System.out.println("일요일에는 영화를 봅니다.");
        } else if (today == Week.SATURDAY) {
            System.out.println("토요일에느 축구를 합니다.");
        } else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }
}
