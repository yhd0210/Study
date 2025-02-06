package chapter07;

public class HeadMountedDisplayTester {
    public static void main(String[] args) {
        HeadMountedDisplay vrDevice = new HeadMountedDisplay("Meta", Skinnable.BLACK) {
            public void diplayVRScence(){
                show("VR 장면을 랜더링 중");
            }
        };

        vrDevice.putOn();
        vrDevice.putOff();
        vrDevice.changeSkin(Skinnable.YELLOW);
        vrDevice.putSkin();
        vrDevice.diplayVRScence();
    }
}
