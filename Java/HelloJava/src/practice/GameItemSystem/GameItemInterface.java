package practice.GameItemSystem;

public abstract class GameItemInterface implements GameItem {
    protected String itemType;
    protected String itmeName;
    protected boolean able;

    protected GameItemInterface(String itemType, String itemName, boolean able) {
        this.itemType = itemType;
        this.itmeName = itemName;
        this.able = able;
    }

    public void interfaceSellable() {
        if (ItemList.isSearchItemSellable(getItmeName()))
            System.out.println("거래 가능한 아이템입니다.");
        else if (!(ItemList.isSearchItemSellable(getItmeName())))
            System.out.println("거래가 불가능한 아이템입니다.");
    }

    public String getItemType() {
        return itemType;
    }

    public String getItmeName() {
        return itmeName;
    }

    public boolean isAble() {
        return able;
    }
}
