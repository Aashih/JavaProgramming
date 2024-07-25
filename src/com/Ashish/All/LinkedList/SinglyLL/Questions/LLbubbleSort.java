package com.Ashish.All.LinkedList.SinglyLL.Questions;


import com.Ashish.All.LinkedList.SinglyLL.Cocept.InsertionNdeletion;
import org.w3c.dom.Node;

public class LLbubbleSort {

    private Node head;
    private Node tail;  //these are the part of structure of linkedlist
    private int size;

    public void MergSortLL() {
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

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //BUBBLE SORT LL
    public void bubbleSort(){
        bubbleSort(size-1,0);
    }
    private void bubbleSort(int row,int col){
        if (row == 0){
            return;
        }
        if (col < row){
            Node first = get(col);
            Node second = get(col+1);

            if (first.value > second.value){
                //then swap
                if (first == head){ // case 1 
                    head =second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail) { //Case 2
                    Node prev = get(col - 1);
                    prev.next=second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                }
                else{
                    //case 3;
                    Node prev = get(col-1);
                    prev.next =second;
                    first.next = second.next;
                    second.next =first;
                }
            }
            bubbleSort(row,col+1);
        }
        bubbleSort(row-1,0);
    }

    public static void main(String[] args) {
        LLbubbleSort l1 = new LLbubbleSort();
        for (int i = 0; i < 6; i++) {
            l1.InsertAtFist(i);
        }
        l1.display();
        System.out.println();


        System.out.println("After applying bubble sort");
        l1.bubbleSort();
        l1.display();
    }
}
