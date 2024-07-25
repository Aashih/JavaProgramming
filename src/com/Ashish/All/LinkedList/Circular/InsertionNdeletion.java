package com.Ashish.All.LinkedList.Circular;

import org.w3c.dom.Node;

public class InsertionNdeletion {
    private Node head;
    private Node tail;

    public InsertionNdeletion() {
        this.head = head;
        this.tail = tail;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.value == val){
           head = head.next;
           tail.next = head;
        }
        do {
            Node n = node.next;
            if (n.value == val){
                node.next  = n.next;
                break;
            }
            node = node.next;
        }while (node!=head);
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + "->");
                node = node.next;
            } while (node != head);
        }
        System.out.print("Head");
    }

}
