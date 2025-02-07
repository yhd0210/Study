package practice.GameItemSystem;

public class Armor extends GameItemInterface{
    public Armor(String itemName, boolean able){
        this.itemType = "Armor";
        this.itmeName = itemName;
        this.able = able;
    }

    @Override
    public void use() {
        System.out.println(itmeName + "를 사용 중입니다.");
    }
}
