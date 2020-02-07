package com.LinkedList;

public class MyLinkedList<T extends Comparable<T>> {
    Node<T> first;
    Node<T> last;
    private int size = 0;

    //The following method adds given element to set and than sorts that set by class's Comparable

    //Comparator doesnt worl
    public boolean add(T t) {
        Node<T> nodeToBeAdded = new Node<>(t, null);

        if (contains(t)) {
            return false;
        }
        if (first == null) {
            first = nodeToBeAdded;
            nodeToBeAdded.next = null;
            last = first;
            size++;
            return true;
        } else {
            Boolean isFound = false;
            Node<T> current = first;
            int counter = 0;

            while (!isFound) {
                //Ete piti avelacnenc skzbum
                if (current.data.compareTo(t) > 0) {
                    counter++;
                    isFound = true;
                }
                break;
            }
            if (counter == getSize()) {
                insertToEnd(t, nodeToBeAdded);
            } else {
                insertInto(t, counter - 1);
            }
        }

        size++;
        return true;
    }

    private void insertInto(T t, int indexToAddTo) {
        Node<T> curr = first;
        Node<T> nodeToAdd = new Node<>(t, null);
        for (int i = 0; i < indexToAddTo; i++) {
            curr = curr.next;
        }
        nodeToAdd.next = curr.next;
        curr.next = nodeToAdd;

    }

    private void insertToEnd(T t, Node<T> nodeToBeAdded) {
        Node<T> curr = first;
        for (int i = 0; i < getSize() - 1; i++) {
            curr = curr.next;
        }
        curr.setNext(nodeToBeAdded);
        nodeToBeAdded.next = null;
        last = nodeToBeAdded;

    }


    // The following method removes given element from set
    public boolean remove(T t) {
        if (contains(t) == false) {
            return false;
        } else {
            Node<T> curr = first;

            if (t.equals(first)) {
                first = first.next;
            } else
                while (curr != last) {
                    if (curr.data == t) {
                        curr.next = curr.next.next;
                        break;
                    }
                    curr = curr.next;
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

    public void print() {
        for (Node c = first; c != null; c = c.next) {
            System.out.println(c.data);
        }
    }
}

class Node<T extends Comparable<T>> {
    public void setNext(Node<T> next) {
        this.next = next;
    }

    Node<T> next;
    T data;

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}


