package com.Ashish.All.LinkedList.SinglyLL.Questions;

//LEETCODE QUESTION NO. 89 https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/
public class RemoveDuplicate {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
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

    public void duplicate() {
        Node node = head; // make another node point to head
        while (node.next != null) { //run a loop till node.next != null
            if (node.value == node.next.value) { //if any duplicate value found
                node.next = node.next.next; //just skip it
            } else {
                node = node.next; // otherwise traverse as usual
            }
        }
        tail = node; //if node comes to the position of tail just re assign tail to node
        node.next = null; //and point that node to null
    }

    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        list.insert(1);
        list.insert(1);
        list.insert(2);
        list.insert(2);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.display();
        list.duplicate();
        System.out.println();
        list.display();

    }
}
