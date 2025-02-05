package chapter06.lecture;

// 단일 객체 생성 디자인 패턴
public class Singleton {
    // 생성자
    private Singleton() {}

    // 정적 필드
    private static Singleton instance;

    // 정적 메소드
    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        // 오류 발생
        // Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton == singleton2);
    }
}

