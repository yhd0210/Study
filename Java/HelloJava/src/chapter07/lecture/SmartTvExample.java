package chapter07.lecture;

import chapter07.RemoteControl;

import java.util.ArrayList;

public class SmartTvExample {
    public static void main(String[] args) {
        SmartTelevision tv = new SmartTelevision();

        RemoteControl rc = (RemoteControl) tv;
        Searchable s = tv;

        RemoteControl smartTv1 = new SmartTelevision();
        Searchable smartTv2 = new SmartTelevision();

    }
}
