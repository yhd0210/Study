package chapter06;

import java.util.Scanner;

public class CoordinateTester2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요 : ");

        System.out.print("X 좌표:");
        double x = sc.nextDouble();

        System.out.print("Y 좌표:");
        double y = sc.nextDouble();

        Coordinate p = new Coordinate(x, y);
        System.out.println("p = {" + p.getX() + ", " + p.getY() + "}");

        // Coordinate q = p;
        Coordinate q = new Coordinate(p);
        System.out.println((p==q)?"p == q 입니다.":"p != q 입니다.");
        System.out.println((p.getX() == q.getX() && p.getY() == q.getY())?"p와 q의 좌표과 같습니다.":"p와 q의 좌표가 다릅니다.");

        System.out.println(compCoordinate(p, q) ? "p와 q의 좌표과 같습니다.":"p와 q의 좌표가 다릅니다.");
    }
    public static boolean compCoordinate(Coordinate p, Coordinate q) {
        return (p.equalTo(q));
    }
}
