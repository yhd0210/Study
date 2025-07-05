package chapter06;

import java.time.LocalDate;

// 날짜 클래스
public class Day {
    // 필드
    private int year = 1; // 년
    private int month = 1; // 월
    private int date = 1; // 일
    
    // 생성자
    public Day() { // 오늘 날짜
        LocalDate today = LocalDate.now();
        this.year = today.getYear();
        this.month = today.getMonthValue();
        this.date = today.getDayOfMonth();
    }

    public Day(int year) {
        this.year = year;
    }
    
    public Day(int year, int month) {
        // this() 또는 super()는 맨 위에 작성을 해주어야 함
        this(year);
        this.month = month;
    }

    public Day(int year, int month, int date) {
        this(year, month);
        this.date = date;
    }

    public Day(Day d) {
        // private지만 같은 클래스의 객체인 경우에는 접근이 가능함
        this(d.year, d.month, d.date);
    }

    // getter, 년월일 불러오기
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDate() {
        return date;
    }

    // setter, 년월일 설정
    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void set(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    // 다른 날짜와 비교 equals
    public boolean equals(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

    @Override
    public String toString() {
        String[] wd = {"토", "일" , "월", "화", "수", "목", "금"};
        return String.format("%04d년 %02d월 %02d일 (%s)", year, month, date, wd[dayOfWeek()]);
    }

    // 요일 찾기
    public int dayOfWeek() {
        // 0: 토요일, 1: 일요일, 2: 월요일, 3: 화요일, 4: 수요일, 5: 목요일, 6: 금요일
        // 그레고리 달력을 전제로 하는 제라의 공식(1582년 10월 15일 이후의 요일 계산)
        int y = year;
        int m = month;
        int d = date;

        if(m == 1 || m == 2) {
            y--;
            m += 12;
        }
        int k = y % 100; // 연도 뒤 2자리
        int j = y / 100; // 연도 앞 2자리

        return (d + (13 * (m + 1) / 5) + k + k / 4 + j / 4 - 2 * j) % 7;
    }
}
