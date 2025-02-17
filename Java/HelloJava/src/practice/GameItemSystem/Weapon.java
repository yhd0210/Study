package practice.GameItemSystem;

public class Weapon extends GameItemInterface {
    public Weapon(String itemName, boolean able) {
        super("Weapon", itemName, able);
    }

    @Override
    public void use() {
        System.out.println(itemName + "를 사용 중입니다.");
    }
}
