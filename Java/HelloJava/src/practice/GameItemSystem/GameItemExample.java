package practice.GameItemSystem;

public class GameItemExample {
    public static void main(String[] args) {
        GameItemInterface myItemInterface1 = new Weapon();
        GameItemInterface myItemInterface2 = new Potion();

        myItemInterface1.use();
        myItemInterface2.use();

        myItemInterface1.interfaceSellable("창");
        myItemInterface2.interfaceSellable("엘릭서");
    }
}
