package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;

public class Palindrome {
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

    public boolean ispalindrom(Node head){
        Node mid = middleNode(head);  // to find the middle of the list
         Node headsecond = reverse(mid); // reverse the list from mid to tail
        Node reversehead = headsecond;   //store headsecond to reverse the list again

        //to campare both the half
        while (head!=null && headsecond!=null){
            if (head.value != headsecond.value){
                break; // if the list is not palindorm it can be detected here
                //if this happens the loop will terminate
            }
            head = head.next;
            headsecond = headsecond.next;
        }
        reverse(reversehead); // re reverse the list
        if (head == null || headsecond == null) { // if any of this is true then
            //our list is palindrom
            return true;
        }
        return false;
    }
}

