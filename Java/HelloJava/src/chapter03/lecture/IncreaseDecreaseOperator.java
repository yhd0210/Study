package chapter03.lecture;

public class IncreaseDecreaseOperator {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("------------------------");
        x++; // ++ 연산 x = x + 1;
        ++x;
        System.out.println("x = " + x);

        System.out.println("------------------------");
        y--; // -- 연산 y = y - 1;
        --y;
        System.out.println("y = " + y);

        System.out.println("------------------------");
        z = x ++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------------------");
        z = ++x;
        System.out.println("z = " + z);
        System.out.println("x = " + x);

        System.out.println("------------------------");
        z = ++x + y++;
        System.out.println("z = " + z);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
