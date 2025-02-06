package practice.bluemarble;

public class City extends PurchasableTile{
    protected ConstructionType constructionType = null; // 현재 건물

    protected Color color;

    public City(String name) {
        super(name);
    }

    @Override
    public int getToll() throws RuntimeException {
        return 0;
    }

    {
        // 색깔 정의
        switch (name) {
            case "타이베이":
            case "베이징":
            case "마닐라":
            case "싱가포르":
            case "카이로":
            case "이스탄불":
                color = Color.PINK;
                break;
        }
        // 통행료 정의
        switch (name) {
            case "타이베이":
                toll = 2000;
                // villa.setToll(10_000);
                // building.setToll(90_000);
                // hotel.setToll(250_000);
                break;
        }
    }
}
