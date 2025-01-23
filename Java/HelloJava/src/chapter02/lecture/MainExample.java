package chapter02.lecture;

public class MainExample {
    public static void main(String[] args) {
        // args 배열의 길이 출력
        System.out.println("매개변수의 개수 "+args.length);
        // args 배열의 모든 요소 출력
        System.out.println("전달된 매개변수 : ");
        for (int i =0; i<args.length; i++ ){
            System.out.println("args["+i+"]: "+args[i]);
        }
    }
}
