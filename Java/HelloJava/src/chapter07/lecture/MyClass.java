package chapter07.lecture;

import chapter07.RemoteControl;

public class MyClass {
    // 1) 필드
    RemoteControl rc = new Television();

    // 2) 생성자
    MyClass() {}

    MyClass(RemoteControl rc) {
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }

    // 3) 메소드 내 로컬변수
    void methodA(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }

    // 4) 메소드 내 매개변수
    void methodB(RemoteControl rc) {
        rc.turnOn();
        rc.setVolume(5);
    }
}
