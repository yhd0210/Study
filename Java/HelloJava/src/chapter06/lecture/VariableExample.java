package chapter06.lecture;

public class VariableExample {
    public static void main(String[] args) {
        System.out.println("클래스 변수 (인스턴스 생성 없이 접근 가능): " + Scope.staticVariable);
        Scope.doStaticMethod();

        // 인스턴스 생성
        Scope instance = new Scope();

        System.out.println("인스턴스 변수 (접근하려면 인스턴스 필요): " + instance.instanceVariable);

        instance.doMethod();
    }
}
