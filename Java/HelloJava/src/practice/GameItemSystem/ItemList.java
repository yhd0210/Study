package practice.GameItemSystem;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    // Private static list to store all item types
    public static List<GameItemInterface> itemTypeList = new ArrayList<>();

    private final String itemType;
    private final String itemName;        // Name of the item
    private static boolean sellable;   // Whether the item is sellable

    private ItemList(String itemType, String itemName, boolean sellable) {
        this.itemType = itemType;
        this.itemName = itemName;
        this.sellable = sellable;
    }

    public static boolean isSellable() {
        return sellable;
    }

    public static boolean isSearchItemSellable(String itemName) {
        for (GameItemInterface gameItemInterface : itemTypeList) {
            if (gameItemInterface.getItmeName().equals(itemName)) {
                return isSellable();
            }
        }
        throw new IllegalArgumentException("등록되지 않은 아이템입니다: " + itemName);
    }

    public String getItemType() {
        return itemType;
    }

    public String getItemName() {
        return itemName;
    }
}
