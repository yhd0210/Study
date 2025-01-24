package chapter06;

import java.time.LocalDate;

public class Day {
    // 필드
    private int year = 1;
    private int month = 1;
    private int date = 1;

    // 생성자
    public Day(){
        LocalDate today = LocalDate.now();
        this.year = today.getYear();
        this.month = today.getMonthValue();
        this.date = today.getDayOfMonth();
    }
    public Day(int year){
        this.year = year;
    }
    public Day(int year, int month) {
        // 대입은 중복 코드이므로 수정해보세요. this()가 자신의 생성자 호출
        this(year);
        this.month = month;
    }
    public Day(int year, int month, int date) {
        this(year, month);
        this.date = date;
    }
    public Day(Day d) {
        this(d.year, d.month, d.date);
    }
    public int getYear(){
        return year;
    }
    public int getMonth(){
        return month;
    }
    public int getDate(){
        return date;
    }
    public boolean equals(Day d) {
        return year == d.year && month == d.month && date == d.date;
    }

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
    @Override
    public String toString(){
        String[] wd = {"일", "월", "화", "수", "목", "금", "토"};
        return String.format("%04d년 %02d월 %02d일 (%s)", year, month,date,wd[dayOfWeek()]);
    }

    // 요일 찾기
    public int dayOfWeek(){
        LocalDate localDate = LocalDate.of(year, month, date);
        return localDate.getDayOfWeek().getValue() % 7;
    }
}
