package chapter06.lecture;

class Card {
    // 클래스 변수, 메서드 영역에서 공유 (객체에서 자주 선언하진 않음)
    public static final double CARD_WIDTH = 5.0; // 가로 길이

    public static final double CARD_HEIGHT = 8.0; // 세로 길이

    // 인스턴스 변수, 힙 영역에서 각자 생성
    public int number;

    public String shape;

    public String color;

    public Card(int number, String shape, String color) {
        this.number = number;
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

public class CardTest {
    public static void main(String[] args) {
        Card myCard = new Card(7, "Heart", "Red");

        /*myCard.number = 7;
        myCard.shape = "Heart"
        myCard.color = "Red";*/

        // 카드 사이즈 출력
        System.out.println("Card Size: " + Card.CARD_WIDTH + " x " + Card.CARD_HEIGHT);

        /*System.out.println("Number: " + myCard.number);
        System.out.println("Shape: " + myCard.shape);
        System.out.println("Color: " + myCard.color);*/

        System.out.println(myCard);
    }
}
