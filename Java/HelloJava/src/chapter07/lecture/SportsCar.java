package chapter07.lecture;

public class SportsCar extends Car {
    
    public boolean isCoupe;

    // 아래 nameHiding 을 지양할 것(상위 클래스와 같은 이름의 변수 선언)
    // public int speed;

    public SportsCar() {
        // 맨위에 컴파일러가 super() 자동 추가
        super(); // 상위 클래스의 기본 생성자 호출
        this.isCoupe = true;
    }

    public SportsCar(boolean isCoupe) {
        super(isCoupe? 2 : 4);
        super.speed = 0;
        this.speed = 0;
        this.isCoupe = isCoupe;
    }

    @Override
    public void speedUp() {
        speed += 10;
        System.out.println("speed = " + speed);
    }

    /*@Override
    public void stop() {
        speed = 0;
        System.out.println("차를 멈춤");
    }*/
}
