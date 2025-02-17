package chapter08.lecture;

interface RemoteControl {
    public abstract void turnOn();
    public abstract void turnOff();
}

class Anonymous_ {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("TV를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("TV를 끕니다.");
        }
    };

    void method1() {
        RemoteControl localVar = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Audio를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Audio를 끕니다.");
            }
        };
        localVar.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }
}

public class Anonymous_Example {
    public static void main(String[] args) {
        Anonymous_ anony = new Anonymous_();

        anony.field.turnOn();

        anony.method1();

        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("Smart TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("Smart TV를 끄니다.");
            }
        });
    }
}
