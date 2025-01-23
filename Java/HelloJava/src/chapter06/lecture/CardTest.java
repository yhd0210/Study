package chapter06.lecture;

class Card {
    public static final double CARD_WIDTH = 5.0; // 가로 길이
    public static final double CARD_HEIGHT = 8.0; // 세로 길이

    public int number;

    public String shape;

    public String color;

    public Card(int Number, String Shape, String Color) {
        number = Number;
        shape = Shape;
        color = Color;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number=" + number +
                ", shape=" + shape +
                ", color=" + color + "}";
    }
}
public class CardTest {
    public static void main(String[] args) {
        Card myCard = new Card(7, "Heart", "Red");

        System.out.println("Card Size : " + Card.CARD_WIDTH + " x " + Card.CARD_HEIGHT);

        System.out.println(myCard);
    }
}
