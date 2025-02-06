package practice.GameItemSystem;

public abstract class GameItemInterface implements GameItem {
    protected String name;

    protected GameItemInterface(){}

    protected GameItemInterface(String name) {
        this.name = name;
    }

}
