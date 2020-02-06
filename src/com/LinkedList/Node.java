package com.LinkedList;

public class Node<T extends Comparable<T>> {
    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public T getData() {
        return data;
    }


    public Node<T> next;
    public Node<T> previous;

    public void setData(T data) {
        this.data = data;
    }

    public T data;

    public Node(Node<T> previous, T data, Node<T> next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }
}
