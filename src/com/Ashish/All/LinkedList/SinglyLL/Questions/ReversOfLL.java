package com.Ashish.All.LinkedList.SinglyLL.Questions;

//LEETCODE 206: https://leetcode.com/problems/reverse-linked-list/
//this question is solve by the iterative method that i have written below
public class ReversOfLL {
    private Node head;
    private Node tail;  //these are the part of structure of linkedlist
    private int size;

    public ReversOfLL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;  //
        }
        System.out.print("END");
    }



    public void InsertAtFist(int val) {
        Node node = new Node(val);  //creating a new node
        node.next = head; //pointing next of this node to head
        head = node; //because head always points to the first node
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertAtEnd(int val) {
        if (tail == null) {
            InsertAtFist(val);
            return;
        }
        Node node = new Node(val); //create a new node
        tail.next = node; //point tail to new node
        tail = node; //make new node = tail
        size++;
    }
//Reversal of LL
    public void revese(Node node) {
        if (node == tail) {
            head = tail;  // when we reach to tail of ll the make head = tail

            return;
        }
        revese(node.next); // this is to traverse throgh whole ll
        tail.next = node; // this is call when it removes from stack
        tail = node; //for better understanding check Notes 
        tail.next = null;
    }
    //In place reversal of LL
    public void InPlaceRev(){
        if (size < 2){
            return;
        }
        Node prev = null; // thid point to the prev element of head which is null
        Node pres = head; // pres points to head
        Node next = pres.next; //next point to the next element of head
        while(pres!=null){
            pres.next = null;
            prev = pres;
            pres = next;
            if (next != null) {
                next = next.next;
            }
            head = prev;
        }
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



        public static void main(String[] args) {
            ReversOfLL l1 = new ReversOfLL();
            l1.InsertAtFist(10);
            l1.InsertAtFist(20);
            l1.InsertAtFist(30);
            l1.InsertAtFist(40);
            l1.display();
            System.out.println();
            l1.revese(l1.head);
            l1.display();

        }

}
