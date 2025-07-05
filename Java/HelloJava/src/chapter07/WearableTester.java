package chapter07;

import java.util.ArrayList;
import java.util.List;

public class WearableTester {
    public static void main(String[] args) {
        List<Wearable> devices = new ArrayList<>();

        devices.add(new HeadPhone());
        devices.add(new SmartWatch());

        for (Wearable device : devices) {
            device.putOn();
        }

        for (Wearable device : devices) {
            device.putOff();
        }

        Wearable device1 = new HeadPhone();
        device1 = new SmartWatch();

        device1.putOn();
        device1.putOff();

        if(device1 instanceof HeadPhone) {
            ((HeadPhone)device1).setVolume(5);
        } else if (device1 instanceof SmartWatch) {
            ((SmartWatch)device1).reset();
        }
    }
}
