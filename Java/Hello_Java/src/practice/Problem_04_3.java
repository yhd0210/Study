package practice;

public class Problem_04_3 {
    public static void main(String[] args) {
        while(true){
            int num1 = (int) (Math.random()*6)+1;
            int num2 = (int) (Math.random()*6)+1;
            System.out.println("주사위 눈의 조합 : (" + num1 + "," + num2 + ")");
            if (num1 + num2 == 5) break;
        }
    }
}
