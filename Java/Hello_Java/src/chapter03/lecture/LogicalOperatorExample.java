package chapter03.lecture;

// 논리연산자(&&, ||, ^, !)
public class LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = '1';
        if (charCode >= 65 && charCode <= 90){
            System.out.println("대문자군요.");
        }
        if (charCode >= 97 && charCode <= 122) {
            System.out.println("소문자군요.");
        }
        if (!(charCode >= 48) && !(charCode <= 57)) {
            System.out.println("0 ~ 9 숫자군요.");
        }

        int value = 6;
        if(value % 2 == 0 || value % 3 == 0){ // 짝수(2의 배수)
            System.out.println("2 또는 3의 배수군요");
        }
        if(value % 2 == 0 | value % 3 == 0){ // 짝수(2의 배수)
            System.out.println("2 또는 3의 배수군요");
        }
    }
}
