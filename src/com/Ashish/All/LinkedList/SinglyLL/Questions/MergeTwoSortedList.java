package com.Ashish.All.LinkedList.SinglyLL.Questions;

//LEETCODE 21. https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedList {
    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public void InsertAtFist(int val) {
        Node node = new Node(val);  //creating a new node
        node.next = head; //pointing next of this node to head
        head = node; //because head always points to the first node
        if (tail == null) {
            tail = head;
        }
    }
    public void insertAtEnd(int val){
        if (tail == null){
            InsertAtFist(val);
            return;
        }
        Node node = new Node(val); //create a new node
        tail.next = node; //point tail to new node
        tail = node; //make new node = tail

    }

    public static MergeTwoSortedList merge(MergeTwoSortedList first,MergeTwoSortedList second){
        Node f = first.head;
        Node s = second.head;
        MergeTwoSortedList ans = new MergeTwoSortedList();
        while (f != null && s!=null){
            if (f.value<s.value){ //when element of fist list smaller then the element of 2nd list then add the value
                // of first list
                ans.insertAtEnd(f.value);
                f = f.next; // and increment f
            }
            //and vice versa of above
            else{
                ans.insertAtEnd(s.value);
                s = s.next;
            }
        }

        //if any element is still left to insert then these is being added by these below steps
        while (f != null){
            ans.insertAtEnd(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertAtEnd(s.value);
            s =s.next;
        }
        return ans;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;  //
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        MergeTwoSortedList l1 = new MergeTwoSortedList();
        l1.insertAtEnd(1);
        l1.insertAtEnd(3);
        l1.insertAtEnd(5);

        l1.display();
        System.out.println();
        MergeTwoSortedList l2 = new MergeTwoSortedList();
        l2.insertAtEnd(1);
        l2.insertAtEnd(2);
        l2.insertAtEnd(9);
        l2.insertAtEnd(14);
        l2.display();
        System.out.println();
        MergeTwoSortedList ans = merge(l1,l2);
        ans.display();
    }
}
