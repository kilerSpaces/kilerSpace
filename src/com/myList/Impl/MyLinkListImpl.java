package com.myList.Impl;

import com.myList.MyLinkLIst;
import com.myList.domain.Node;

public class MyLinkListImpl<T> implements MyLinkLIst<T> {
    private Node head;
    private Node node;
    private Node prenode;
    private int count;

    public MyLinkListImpl() {
        this.head = null;
        this.prenode = null;
        this.count = 0;
    }

    @Override
    public boolean add(T t) {
        if (this.count==0){
            this.head = new Node(t,count);
            this.prenode = this.head;
        }else if (this.count>0){
            Node node1 = new Node(prenode, t, count);
            this.prenode = node1;
        }
        count++;
        return true;
    }

    @Override
    public boolean delete(int i) {
        Node before = select(i-1);
        Node node = select(i);
        Node after = select(i+1);
        before.setNext(after);
        after.setBefore(before);
        after.setIndex(i);
        return true;
    }

    @Override
    public Object get(int i) {
        return select(i).getT();
    }

    @Override
    public boolean update(int i,T t) {
        select(i).setT(t);
        return true ;
    }

    @Override
    public boolean isempty() {
        if (count==0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Integer size() {
        return this.count;
    }

    public Node select(Integer i){
        if (i<0||i>count){
            return null;
        }else {
            node = head;
            while (node.getIndex() != i && node !=null){
                node = node.hasnext();
            }
            if (node==null){
                return null;
            }
            return node;
        }
    }

    public void printAll(){
        node = head;
        while (node !=null){
            System.out.println(node.getT());
            node = node.hasnext();
        }
    }
}
