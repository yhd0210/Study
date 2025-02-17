package chapter09.lecture;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
//    T item;
//
//    public void setItem(T item) {
//        this.item = item;
//    }
//
//    public T getItem() {
//        return item;
//    }
    List<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    public List<T> getList() {
        return list;
    }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}
