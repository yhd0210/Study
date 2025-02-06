package practice.bluemarble;

public enum Color {
    PINK(0, 50_000, 150_000, 250_000),
    GREEN(1, 100_000, 300_000, 500_000),
    BROWN(2, 150_000, 450_000, 750_000),
    NAVY(3, 200_000, 600_000, 1_000_000);

    private int id;
    private int villaPrice;
    private int buildingPrice;
    private int hotelPrice;

    Color(int id, int villaPrice, int buildingPrice, int hotelPrice) {
        this.id = id;
        this.villaPrice = villaPrice;
        this.buildingPrice = buildingPrice;
        this.hotelPrice = hotelPrice;
    }

    public int getId() {
        return id;
    }

    public int getVillaPrice() {
        return villaPrice;
    }

    public int getBuildingPrice() {
        return buildingPrice;
    }

    public int getHotelPrice() {
        return hotelPrice;
    }
}
