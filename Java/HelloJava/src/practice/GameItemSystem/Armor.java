package practice.GameItemSystem;

public class Armor extends GameItemInterface{

    public Armor(String itemName, boolean able) {
        super("Armor", itemName, able); // 부모 생성자 호출
    }

    @Override
    public void use() {
        if (able) {
            System.out.println(itemName + "를 사용 중입니다.");
        } else {
            System.out.println(itemName + "는 사용할 수 없습니다.");
        }
    }
}
