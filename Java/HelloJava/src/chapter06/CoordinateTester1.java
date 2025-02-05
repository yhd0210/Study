package chapter06;

import java.util.Scanner;

public class CoordinateTester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌표 p를 입력하세요:");

        System.out.print("X 좌표:");
        double x = sc.nextDouble();

        System.out.print("Y 좌표:");
        double y = sc.nextDouble();

        Coordinate p = new Coordinate(x, y);
        System.out.println("p = " + p); // toString() 오버라이딩 필요

        Coordinate q = new Coordinate(p); // Coordinate 타입을 parameter로 하는 생성자 필요
        System.out.println("q = " + q);

        if(p.equalTo(q)) { // equalTo 메소드 필요
            System.out.println("p와 q의 좌표가 같습니다.");
        } else {
            System.out.println("p와 q의 좌표가 다릅니다.");
        }

        Coordinate c1 = new Coordinate(); // (0.0, 0.0)
        Coordinate c2 = new Coordinate(1.1, 2.2);

        System.out.println("c1 = " + c1.toString()); // toString() 직접 호출하지 않아도 됨 (내부에서 호출 구현되있음)
        System.out.println("c2 = " + c2);

        Coordinate[] a = new Coordinate[3];

        for (int i = 0; i < a.length; i++) {
            a[i] = new Coordinate();
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
