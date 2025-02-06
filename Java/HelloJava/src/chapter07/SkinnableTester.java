package chapter07;

public class SkinnableTester {
    public static void main(String[] args) {
        SkinnableSoftware x = new SkinnableSoftware();
        SkinnableSoftware y = new SkinnableSoftware(Skinnable.GREEN);

        x.changeSkin(Skinnable.YELLOW);

        System.out.println("x의 스킨은 " + x.getSkinString() + "입니다.");
        System.out.println("y의 스킨은 " + y.getSkinString() + "입니다.");;
    }
}
