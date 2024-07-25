package com.Ashish.All.LinkedList.DoublyLL;

import org.w3c.dom.Node;

public class InsertNDeletion {
    private Node head;
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value) {
            this.value = value;
        }
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp; // to get the tail of list
            temp = temp.next;
        }
        System.out.print("END");
        System.out.println();
//        System.out.println("List in revese");
//    //To print in Reverse
//        while (last != null){
//            System.out.print(last.value + " -> ");
//            last = last.prev;
//        }
//        System.out.print("START");
//    }
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }
    //Insert at  the last node

    public void InsertLast(int val){
        Node node = new Node(val);
        Node tail = head;
        node.next = null;
        if (head == null){
            node.prev = null;
            head = node;
            return;
        }
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next = node;
        node.prev = tail;

    }

    //To insert after node
    public Node find(int value){
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insertAfter(int after,int val){
        Node p = find(after);
        if (p == null){
            System.out.println("Doesn't exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null){
            node.next.prev = node;
        }
    }
}
