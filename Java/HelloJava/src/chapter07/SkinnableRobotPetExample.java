package chapter07;

import java.util.ArrayList;
import java.util.List;

public class SkinnableRobotPetExample {
    public static void main(String[] args) {
        List<SkinnableRobotPet> pets = new ArrayList<>();

        pets.add(new SkinnableRobotPet("KKK","KIM", Skinnable.GREEN));
        pets.add(new SkinnableRobotPet("KKK123","KI", Skinnable.GREEN));
        pets.add(new SkinnableRobotPet("KKeK","KM", Skinnable.RED));
        pets.add(new SkinnableRobotPet("TT","KTU", Skinnable.BLACK));
        pets.add(new SkinnableRobotPet("KTK","YU", Skinnable.BLUE));

        for (SkinnableRobotPet p : pets){
            p.introduce();
        }
    }
}
