package chapter06;

import java.util.Scanner;

public class CoordinateTester2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요:");

        System.out.print("X 좌표:");
        double x = sc.nextDouble();

        System.out.print("Y 좌표:");
        double y = sc.nextDouble();

        Coordinate p = new Coordinate(x, y);


        System.out.println("좌표 q를 입력하세요:");

        System.out.print("X좌표:");
        x = sc.nextDouble();

        System.out.print("Y좌표:");
        y = sc.nextDouble();

        Coordinate q = new Coordinate(x, y);
        System.out.println((p == q)? "p == q입니다." : "p != q 입니다.");
        System.out.println((p.getX() == q.getX() && p.getY() == q.getY())? "p와 q의 좌표가 같습니다." : "p와 q의 좌표가 다릅니다.");
        
        // compCoordinate()을 정적 메소드로도 작성해보기
        System.out.println(compCoordinate(p, q)? "p와 q의 좌표가 같습니다." : "p와 q의 좌표가 다릅니다.");

    }

    static boolean compCoordinate(Coordinate p, Coordinate q) {
        return p.getX() == q.getX() && p.getY() == q.getY();
    }
}
