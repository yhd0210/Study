package chapter06;

public class Coordinate {
    private double x;
    private double y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate(Coordinate coordinate){
        this.x = coordinate.x;
        this.y = coordinate.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("Coordinate(x=%.2f, y=%.2f)", x, y);
    }

    public boolean equalTo(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Coordinate that = (Coordinate) obj;
        return Double.compare(that.x, x) == 0 && Double.compare(that.y, y) == 0;
    }
}
