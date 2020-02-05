package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MySet<T extends Comparable<T>> {
    List<T> list = new ArrayList<>();

    void add(T t) {
        if (list.contains(t)) {
            return;
        }
        list.add(t);
        Collections.sort(list);
    }

    T remove(T t) {
        if (!list.contains(t)) {
            throw new NullPointerException("There is no such object in MySet ");
        }
        list.remove(t);
        return (T) ("Removed element is: " + t);
    }

    int getSize() {
        return list.size();
    }

    boolean contains(T t) {
        return list.indexOf(t) >= 0;
    }

    void print(MySet<T> set) {
        System.out.println(set.list);
    }

}
