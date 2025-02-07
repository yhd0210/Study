package practice.GameItemSystem;

public class Potion extends GameItemInterface{
    public Potion(String itemName, boolean able){
        this.itemType = "포션";
        this.itmeName = itemName;
        this.able = able;
    }

    @Override
    public void use() {
        System.out.println(itmeName + "를 사용 중입니다.");
    }
}
