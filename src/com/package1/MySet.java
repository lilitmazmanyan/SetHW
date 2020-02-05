package com.package1;

import java.util.ArrayList;
import java.util.List;

public class MySet<T> {
    List<T> list = new ArrayList<>();

    public void add(T t) {
        if (list.contains(t)) {
            return;
        }
        list.add(t);
//        Collections.sort(list);
    }

    public T remove(T t) {
        if (!list.contains(t)) {
            throw new NullPointerException("There is no such object in MySet ");
        }
        list.remove(t);
        return t;
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(T t) {
        return list.indexOf(t) >= 0;
    }

    public void print(MySet<T> set) {
        System.out.println(set.list);
    }

}
