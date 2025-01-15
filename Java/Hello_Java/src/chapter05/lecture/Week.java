package chapter05.lecture;

// week enum은 요일을  표현하는 상수들의 집합
// 각 상수(MONDAY, TUESDAY, .....)는 Week 열거형의 인스턴스 (Heap 메모리에 생성된 실체)
// 열거형 상수(UPPER_SNAKE_CASE)는 암묵o적으로 public static final로 선언되며 변경할 수 없음
public enum Week {
    MONDAY,     // MONDAY.name() : "MONDAY", ordinal() : 0
    TUESDAY,    // TUESDAY.name() : "TUESDAY", ordinal() : 1
    WEDNESDAY,  // WEDNESDAY.name() : "WEDNESDAY", ordinal() : 2
    THURSDAY,   // THURSDAY.name() : "THURSDAY", ordinal() : 3
    FRIDAY,     // FRIDAY.name() : "FRIDAY", ordinal() : 4
    SATURDAY,   // SATURDAY.name() : "SATURDAY", ordinal() : 5
    SUNDAY      // SUNDAY.name() : "SUNDAY", ordinal() : 6
}

// 설명 :
// 1. name() 메소드 :
//      - 각 상수의 이름(문자열을) 반환
//      - 예) Week.MONDAY.name() -> "MONDAY"
// 2. ordinal() 메소드 :
//      - 각 상수가 정의된 순서를 0부터 시작하여 반환
//      - 예) Week.MONDAY.ordinal() -> 0
// 3. Week 열거형의 각 상수는 단 하나의 인스턴스로 생성되며 힙 메모리에 저장
//      - Week 열거형 클래스 자페는 메소드 영역에 로드됨
// 4. Week.valueOf("MONDAY")를 호출하면 "MONDAY"라는 이름에 해당하는 상수를 반환
//      - 유효하지 않은 이름을 전달하면 IlleagalArgumentException이 발생