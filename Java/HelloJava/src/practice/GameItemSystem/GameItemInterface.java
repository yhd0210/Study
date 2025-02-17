package practice.GameItemSystem;

public abstract class GameItemInterface implements GameItem {
    protected String itemType;
    protected String itemName;
    protected boolean able;

    protected GameItemInterface(String itemType, String itemName, boolean able) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.able = able;
    }

    public void interfaceSellable() {
        if (ItemList.isSearchItemSellable(getItemName()))
            System.out.println("거래 가능한 아이템입니다.");
        else if (!(ItemList.isSearchItemSellable(getItemName())))
            System.out.println("거래가 불가능한 아이템입니다.");
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }

    public boolean isAble() {
        return able;
    }
}
