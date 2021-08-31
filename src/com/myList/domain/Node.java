package com.myList.domain;

public class Node<T> {
    private Node before;
    private T t;
    private Node next;
    private int index;

    public Node getBefore() {
        return before;
    }

    public void setBefore(Node before) {
        this.before = before;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node(T t, int index) {
        this( null,t,null,index);
    }
    public Node(Node prenode,T t,int index) {
        this( prenode,t,null,index);
    }

    public Node(Node prenode,T t, Node next,int index) {
        this.before = prenode;
        this.t = t;
        this.next = next;
        this.index = index;
    }

    public Node hasnext(){
        if (next!=null){
            return next;
        }
        return null;
    }
}
