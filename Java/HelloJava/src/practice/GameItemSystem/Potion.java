package practice.GameItemSystem;

public class Potion extends GameItemInterface{
    public Potion(String itemName, boolean able){
        super("Potion", itemName, able);
    }

    @Override
    public void use() {
        System.out.println(itemName + "를 사용 중입니다.");
    }
}
