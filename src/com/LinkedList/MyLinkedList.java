package com.LinkedList;

public class MyLinkedList<T extends Comparable<T>> {
    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    //The following method adds given element to set and than sorts that set by class's Comparable
    public boolean add(T t) {

        Node newNode = new Node(null, t, null);

        if (contains(t)) {
            return false;
        }
        if (first == null) {
            first = newNode;
            first.setNext(last);
            size++;
            return true;
        }
        Node current = first;
        boolean eghela = false;
        while (current != null) {
            if (current.data.compareTo(t) > 0) {
                //piti current-i previous-i poxaren mcnenq ed zibily
                if (current == first) {
                    newNode.setNext(first);
                    first.setPrevious(newNode);
                    first = newNode;
                }
                current.previous.setNext(newNode);
                newNode.setPrevious(current.getPrevious());
                current.setPrevious(newNode);
                newNode.setNext(current);
                eghela = true;
                break;
            }
            current = current.getNext();
        }
        if (eghela == false) {
            newNode.setPrevious(last);
            last = newNode;
//            last.getPrevious().setNext(newNode);
            last.setNext(null);
        }

        size++;
        return true;
    }

    // The following method removes given element from set
    public boolean remove(T t) {
        if (first == null) {
            return false;
        } else {
            for (Node c = first; c != last; c = c.next) {
                if (c.equals(t)) {
                    c.previous.setNext(c.next);
                    c.next.setPrevious(c.previous);
                }
            }
            size--;
            return true;
        }
    }

    //Returns true or false depending on the element's presence in the list
    public boolean contains(T t) {
        if (first == null) return false;

        for (Node c = first; c != null; c = c.next) {
            if (c.data.equals(t)) {
                return true;
            }
        }
        return false;
    }

    public int getSize() {
        return size;
    }


    public boolean print() {
        for (Node current = first; current != null; current = current.getNext()) {
            System.out.println(current.data);
        }
        return true;
    }
}
