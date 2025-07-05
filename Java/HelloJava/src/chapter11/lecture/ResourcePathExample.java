package chapter11.lecture;

public class ResourcePathExample {
    public static void main(String[] args) {
        Class clazz = ResourcePathExample.class;

        String photo1Path = clazz.getResource("photo1.png").getPath();
        String photo2Path = clazz.getResource("images/photo2.jpg").getPath();

        System.out.println(photo1Path);
        System.out.println(photo2Path);

    }
}
