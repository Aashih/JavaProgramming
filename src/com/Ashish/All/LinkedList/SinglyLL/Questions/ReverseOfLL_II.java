package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;

//https://leetcode.com/problems/reverse-linked-list-ii/description/
public class ReverseOfLL_II {
    private Node head;
    private Node tail;  //these are the part of structure of linkedlist
    private int size;

    public ReverseOfLL_II() {
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

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public Node reverseBtw(Node head,int left,int right){
        if (left == right){
            return head;  // Means we have no node b/w l and r to reverse
         }
        //Skip the first left - 1 node
        Node current = head;
        Node prev = null;
        for (int i = 0; current != null && i < left - 1; i++) {
            prev = current;
            current = current.next;
        }
        Node last = prev; //point the first node of the the elemet of
                          // range l to r to prev
        Node newEnd = current; //make a node and point it to first element of range

        //Reverse between left and right
        //which is same as reversing a LL is
        Node next = current.next;
        for (int i = 0; current!=null && i < right - left +1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        if (last!=null){
            last.next = prev;
        }
        else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
