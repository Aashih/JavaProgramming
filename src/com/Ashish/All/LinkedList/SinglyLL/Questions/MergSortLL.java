package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;
//https://leetcode.com/problems/sort-list/description/

public class MergSortLL {

    ListNode head;
    class ListNode {
        int val;
        ListNode next;
    }

    public ListNode sort(ListNode head) {
        if (head == null && head.next == null) {
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sort(head);
        ListNode right = sort(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (l2 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
                tail = tail.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
        }
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        return tail.next;
    }

    ListNode getMid(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
        }
        return s;
    }
    public void display(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;  //
        }
        System.out.print("END");
    }

    public static void main(String[] args) {

    }
}
