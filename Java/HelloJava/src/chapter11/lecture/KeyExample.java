package chapter11.lecture;

import java.util.HashMap;

class Key {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Key) {
            Key compareKey = (Key) obj;
            return this.number == compareKey.number;
        }
        else {
            return false;
        }
    }

    public int hashcode(){
        return number;
    }
}

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();

        Key key1 = new Key(1);

        hashMap.put(key1, "소설 '홍길동전'의 주인공이자 초능력을 부리는 인물");

        Key key2 = new Key(1);
        System.out.println("key2.hashCode() = " + key2.hashCode());

        String value = hashMap.get(key2);
        System.out.println(value);
    }
}
