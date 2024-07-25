package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;

//https://leetcode.com/problems/reorder-list/description/
//steps to follow:
//1.get a middle of a LL
//2.Reverse LL from middle to end
//3. take hf and hs to place the element which is asked in the question
public class ReOrderedLL {
    private Node head;

    class Node{
        int value;
        Node next;
    }
    public Node middleNode(Node head){
        Node f = head;
        Node s = head;
        while(f!=null && f.next!=null){
            s = s.next;
            f = f.next.next;
        }
        return s;
    }


    public Node reverse(Node head){
        if (head ==null){
            return head;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present!=null){
            present.next=prev;
            prev = present;
            present = next;
            if (next!=null){
                next = next.next;
            }
        }
        return prev;
    }

    public void reorderList(Node head){
        if (head == null || head.next == null){
            return;
        }
        Node mid = middleNode(head);
        Node hs = reverse(mid);
        Node hf = head;

        //Re arrange nodes according to question
        while (hf != null && hs!=null){
            Node temp = hf.next; // before MERGING we have to store hf next to
            hf.next = hs;        //somewhere else
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        //setting next of tail to null;
        if (hf!=null){
            hf.next = null;
        }
    }
}
