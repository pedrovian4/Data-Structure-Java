package com.company;

public class Node {
    Object element;
    Node next;

    Node(Object element, Node next){
        this.element= element;
        this.next = next;}

    public Object getElement() {
        return this.element;
    }

    public Node getNext() {
        return next;
    }


    public void setNext(Node next) {
        this.next = next;
    }
}
