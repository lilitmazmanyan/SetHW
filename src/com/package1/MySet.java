package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MySet<T extends Comparable<T>> {
    List<T> list = new ArrayList<>();

    //The following method adds given element to set and than sorts that set by class's Comparable
    void add(T t) {
        if (list.contains(t)) {
            return;
        }
        list.add(t);
        Collections.sort(list);
    }

    /* The following method removes given element from set
    and returns it according to that class's toStrings method */
    T remove(T t) {
        if (!list.contains(t)) {
            throw new NullPointerException("There is no such object in MySet ");
        }
        list.remove(t);
        return (T) ("Removed element is: " + t);
    }

    //This method returns the actual size of the list
    int getSize() {
        return list.size();
    }

    //Returns true or false depending on the element's presence in the list
    boolean contains(T t) {
        return list.indexOf(t) >= 0;
    }

    //The following method prints the set by turning it into a list
    void print(MySet<T> set) {
        System.out.println(set.list);
    }

}
