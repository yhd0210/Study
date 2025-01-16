package chapter05.lecture;

public class EnumWeekExample2 {
    public static void main(String[] args) {
        // 요일에 따른 일정 배열 예시
        String[] schedule = new String[7]; // index 0 ~ 6

        // Week 이넘 클래스의 순서 (ordinal)
        // 월요일(0), 화요일(1) .. 일요일(6)

        // 각 요일의 일정 추가
        schedule[Week.MONDAY.ordinal()] = "일하러 갑니다.";
        schedule[Week.WEDNESDAY.ordinal()] = "일 끝나고 운동하러 갑니다.";
        schedule[Week.FRIDAY.ordinal()] = "밤에 영화를 봅니다.";

        // 향상된 for문으로 순환
        for(Week day : Week.values()) {
            String dayName = day.name();
            String task = schedule[day.ordinal()];
            System.out.println(dayName + ": " + (task != null ? task : "일정이 없습니다."));
        }
    }
}
