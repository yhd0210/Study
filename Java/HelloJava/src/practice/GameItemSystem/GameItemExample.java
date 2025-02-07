package practice.GameItemSystem;

import java.util.ArrayList;
import java.util.List;

import static practice.GameItemSystem.ItemList.itemTypeList;

public class GameItemExample {
    public static void main(String[] args) {
        itemTypeList.add(new Weapon("Sword", true));
        itemTypeList.add(new Weapon("Spear", false));

        for (GameItemInterface itemList : itemTypeList){
            itemList.use();
        }
    }
}
