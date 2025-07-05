package chapter13.lecture;

public class PrefixExample {
    public static void main(String[] args) {
        String prefix = "im";
        String src = "impossible";

        boolean able =  startswith(prefix, src);
        System.out.println(able);
    }
    public static boolean startswith(String prefix, String src) {
        int i;

        for (i = 0; i < prefix.length(); i ++) {
            if(src.charAt(i) != prefix.charAt(i)) {
                return false;
            }
        }
        if (i==prefix.length()) {
            System.out.println("접두사를 포함하고 있습니다.");
        }
        return true;
    }
}
