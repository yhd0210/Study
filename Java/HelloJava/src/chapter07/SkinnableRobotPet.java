package chapter07;

// 로봇 펫은 name, masterName(주인 이름)을 필드로 갖고 있음
// 필드와 관련된 getter는 전부 구현할 것
// 로봇 펫은 자기 소개(Introduce)와 가사일(Work)을 할 수 있음
public class SkinnableRobotPet extends  RobotPet implements Skinnable {
    private int skin;

    public SkinnableRobotPet(String name, String masterName, int skin) {
        super(name, masterName);
        this.skin = skin;
    }

    public int getSkin() {
        return skin;
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

    @Override
    public void changeSkin(int skin) {
        this.skin = skin;
    }

    @Override
    public void work() {
        System.out.println("청소를 할 수 있습니다.");
    }

    @Override
    public void toStr() {
        System.out.println("로봇 펫의 이름은 " + getName() + "이고 주인의 이름은 " + getMasterName() + "입니다.");
    }
}
