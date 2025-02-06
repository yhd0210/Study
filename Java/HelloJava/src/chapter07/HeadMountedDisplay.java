package chapter07;

// VR, 구글 글래스 등 ...
public abstract class HeadMountedDisplay implements Wearable, Skinnable, Display {
    private String vendor;

    public HeadMountedDisplay() {}

    public HeadMountedDisplay(String vendor, int skin) {
        this.vendor = vendor;
        this.skin = skin;
    }

    public abstract void diplayVRScence();

    private int skin;

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void putOn() {
        System.out.println("디스플레이를 착용했습니다.");
    }

    @Override
    public void putOff() {
        System.out.println("디스플레이를 벗었습니다.");
    }

    @Override
    public void show(String content) {
        System.out.println("[" + vendor + "사 제품] 화면에 표시: " + content);
    }

    public String getSkinString() {
        switch (skin) {
            case BLACK:
                return "BLACK";
            case RED:
                return "RED";
            case GREEN:
                return "GREEN";
            case BLUE:
                return "BLUE";
            case YELLOW:
                return "YELLOW";
            default:
                return "Unknown";
        }
    }

    public void putSkin() {
        System.out.println(getSkinString());
    }
}
