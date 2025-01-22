package chapter06.lecture;

public class Singleton {
    private Singleton() {

    }
    private static Singleton instance;

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton();

        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2==singleton);
    }
}
