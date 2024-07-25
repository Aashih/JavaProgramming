package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;
//https://leetcode.com/problems/middle-of-the-linked-list/description/
//This problem follow fast and slow pointer approch

//by applying fast and slow pointer approch when aur fast goes to last node then
// our slow will be at the half of the fast which is the middle of the LL because fast moves +2 and slow moves +1;
public class MiddleLL {
    private Node head;

    class ListNode {
        int value;
        private ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value,ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next !=null){
            fast = fast.next.next;   //for exmple if A travel twice of B then when A reaches the destination
//                                     B tarvel Half of the distance ie. if A tarvel 10km and B tarvel 5Km
             slow = slow.next;
        }
        return slow;
    }

}
