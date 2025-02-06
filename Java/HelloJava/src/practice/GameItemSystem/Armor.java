package practice.GameItemSystem;

public class Armor extends GameItemInterface{
    public Armor(){
        super("아머");
    }

    @Override
    public void use() {
        System.out.println(name+"를 사용 중입니다.");
    }

    @Override
    public void interfaceSellable(String name) {
        if (ItemType.isItemSellable(name))
            System.out.println("거래 가능한 아이템입니다.");
        else if (!(ItemType.isItemSellable(name)))
            System.out.println("거래가 불가능한 아이템입니다.");
    }
}
