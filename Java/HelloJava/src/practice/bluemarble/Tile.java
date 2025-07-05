package practice.bluemarble;

public abstract class Tile {
    protected String name;

    public Tile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
