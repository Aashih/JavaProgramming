package com.Ashish.All.LinkedList.SinglyLL.Cocept;

public class InsertionNdeletion {
    private Node head;
    private Node tail;  //these are the part of structure of linkedlist
    private int size;

    public InsertionNdeletion() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next; // next is the reference variable that is going to point

        //to the object that we are provided
        //By default value of next node = NULL
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;  //
        }
        System.out.print("END");
    }
    public void InsertAtFist(int val){
        Node node = new Node(val);  //creating a new node
        node.next = head; //pointing next of this node to head
        head = node ; //because head always points to the first node
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertAtEnd(int val){
        if (tail == null){
            InsertAtFist(val);
            return;
        }
        Node node = new Node(val); //create a new node
        tail.next = node; //point tail to new node
        tail = node; //make new node = tail
        node.next = null;
        size++;
    }

//    public void InsertEndWithoutTail(int val){
//        if(head == null){
//            InsertAtFist(val);
//            return;
//        }
//        Node node = new Node(val);
//        Node temp = head;
//        while (temp.next != null){
//            temp = temp.next;
//        }
//        temp.next = node;
//
//    }

    //Insert using recursion
    public void insertRec(int val,int index){
        head = insertRec(val,index,head);
    }
    private Node insertRec(int val,int index,Node node){
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val,index-1,node.next);
        return node;
    }

//    public void InsertAtIndex(int value,int index){
//        if (index ==0){
//            InsertAtFist(value);
//            return;
//        }
//        if (index == size){
//            insertAtEnd(value);
//            return;
//        }
//        Node temp = head;
//        for (int i = 1; i < index; i++) {
//            temp = temp.next;
//        }
//        Node node = new Node(value,temp.next);
//        temp.next = node;
//        size++;
//    }

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    //Delete the last node

    public int deleteEnd(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next=null;
        return val;
    }

    public int deleteAtindex(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index == size - 1){
            return deleteEnd();
        }
        Node prev = get(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //to find index in which value is present
    public int find(int value){
        Node node = head;
        int index = 0 ;
        while (node!=null){
            if (node.value == value){
                return index;
            }
            index++;
            node = node.next;
        }
        return -1;
    }



    }

