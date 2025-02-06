package chapter07;

public interface RemoteControl {
    // 필드 (인스턴스 + 정적 필드)는 선언이 불가
    // 인터페이스는 객체 사용 방법을 정의한 것으로 상수만 선언 가능
    // public static final을 생략하더라도 커파일 과정에서 자동으로 추가
    public static final int MAX_VOLUME = 10;
    public static final int MIN_VOLUME = 0;

    // 추상 메소드, 메소드 선언부만 작성
    // public abstract를 생략하더라도 컴파일 과정에서 자동으로 추가
    // 추상 메서드는 실행 블록이 필요 없음. ㄸ문에 중괄호 생략
    // 인테페이스는 일반 메서드 구현 불가
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setVolume(int volume);
}
