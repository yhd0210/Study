package practice.GameItemSystem;

import java.util.ArrayList;
import java.util.List;

public class ItemType {
    protected static List<ItemType> itemTypeList = new ArrayList<>();

    protected String name;
    protected static boolean itemSellable;

    protected ItemType(String name, boolean able){
        this.name = name;
        this.itemSellable = able;
    }

    static {
        itemTypeList.add(new ItemType("검",true));
        itemTypeList.add(new ItemType("활",true));
        itemTypeList.add(new ItemType("창",true));
        itemTypeList.add(new ItemType("방패",true));
        itemTypeList.add(new ItemType("엘릭서",false));
        itemTypeList.add(new ItemType("힐포션",true));
        itemTypeList.add(new ItemType("힘포션",true));
        itemTypeList.add(new ItemType("가죽방어구",true));
        itemTypeList.add(new ItemType("철제방어구",true));
    }

    public String getName() {
        return name;
    }

    public static boolean isItemSellable() {
        return itemSellable;
    }

    public static boolean isItemSellable(String name) {
        for (ItemType itemTypeList : ItemType.itemTypeList) {
            if (itemTypeList.getName().equals(name))
                return itemSellable;
        }
        throw new RuntimeException("등록되지 않은 아이템 입니다.");
    }
}
