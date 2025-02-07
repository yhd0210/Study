package practice.GameItemSystem;

public class Weapon extends GameItemInterface {
    public Weapon(String itemName, boolean able) {
        this.itemType = "무기";
        this.itmeName = itemName;
        this.able = able;
    }

    @Override
    public void use() {
        System.out.println(itmeName + "를 사용 중입니다.");
    }
}
