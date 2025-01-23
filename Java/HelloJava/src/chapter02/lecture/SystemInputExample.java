package chapter02.lecture;

public class SystemInputExample {
    public static void main(String[] args) throws Exception{
        int keyCode;

        System.out.print("입력 : ");

        do{
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
        }while(keyCode != 113); // q(113)가 입력되면 반복문탈출
    }
}
