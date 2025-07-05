package chapter06.lecture;

class Car { // 자동차 객체 설계도
    // 모델명
    public String model;

    // 색상
    public String color;

    // 최고 속력
    public int maxSpeed;

    // 기본 생성자 (파라미터가 없음)
    // 파라미터가 있는 생성자를 작성할 경우 컴파일러가 자동으로 추가하지 않음
    public Car() {}

    // 파라미터가 있는 생성자
    public Car(String model) {
        this.model = model;
    }

    // 메서드 시그니처 같아가 컴파일 오류 발생
    /*public Car(String color) {
        this.color = color;
    }*/
    
    // 메서드 오버로딩
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}

public class CarTest { // 실행부가 있는 클래스
    public static void main(String[] args) {
        // 생성자 호출
        Car car = new Car();
        Car spark = new Car("스파크");
        Car sonata = new Car("소나타", "검은색");
        Car grandeur = new Car("그랜저", "흰색", 300);

        System.out.println(car.model + " / " + car.color + " / " + car.maxSpeed);
        System.out.println(spark.model + " / " + spark.color + " / " + spark.maxSpeed);
        System.out.println(sonata.model + " / " + sonata.color + " / " + sonata.maxSpeed);
        System.out.println(grandeur.model + " / " + grandeur.color + " / " + grandeur.maxSpeed);
    }
}
