package com.company;

public class LinkedList {

    private  Node head = null;
    private  Node tale =null;
    private int elementsTotal = 0;

    public  void add(Object element){
        Node node = new Node(element,head);

        this.head = node;

        if(this.elementsTotal==0) this.tale =this.head;

        this.elementsTotal++;
    }

    private  boolean positionExist(int position){
        return position>=0 && position<this.elementsTotal;
    }

    private Node getNode(int position){


        if(positionExist(position)){
            Node node = this.head;

            for(int i = 0; i <position; i++) node.getNext();

            return node;}
        else
            throw new IllegalArgumentException("This position does not exist");
    }

    public  void add (Object element, int position){

        if (position==0) add(element);

        else if(!positionExist(position)) throw new IllegalArgumentException("This position does not exist");

        else {
            Node previous_node = getNode(position - 1);
            Node node = new Node(element, previous_node.getNext());
            previous_node.setNext(node);
            this.elementsTotal++;
        }


    }

    public  void addAtTheEnd(Object element){

        if(this.elementsTotal == 0) add(element);


        Node node  = new Node(element, null);
        this.tale.setNext(node);
        this.tale = node;

        this.elementsTotal++;
    }


    public Object get(int position){
        if(positionExist(position))
            return getNode(position).getElement();
        else
            throw new IllegalArgumentException("It is not a valid position");
    }
    public  void  remove(int position){}

    public  int size(){
        return  0;
    }

    public boolean exits(Object p){
        return  false;
    }

    @Override
    public String toString() {

        if(elementsTotal ==0){
            return " ";
        }

        Node now = this.head;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i<this.elementsTotal; i++){

            stringBuilder.append(now.getElement());

            now = now.getNext();

            if((this.elementsTotal-1==i)) continue;

            stringBuilder.append(",");

        }
        return stringBuilder.toString();
    }
}
