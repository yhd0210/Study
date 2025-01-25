import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService.startSystem();
        while(true){
            UserService.userServicePage();
        }
    }
}
