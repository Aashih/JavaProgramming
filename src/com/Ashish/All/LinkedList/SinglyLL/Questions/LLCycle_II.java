package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;

//https://leetcode.com/problems/linked-list-cycle-ii/description/
//approch : 1.Find the length of cycle
//          2. Move s ahead by the length of cycle
//          3. Move s and f one by one it will meet at start;

//T.C = O(n);
public class LLCycle_II {
       // in this type of cycle we have to return the node where
       // where cycle is started
    private Node head;
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public int lengthCycle(ListNode head) {
       ListNode fast = head;
       ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                // calculate the length-=
               ListNode temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
    }
    public ListNode DetectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while (fast != null && fast.next == null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                length = lengthCycle(slow); // this will find the length of cycle
                break;
            }
        }
        if (length == 0){
            return null;  //means no class is present;
        }
        //Now we have to find the start
        ListNode f = head;
        ListNode s = head;

        //Move slow to the length of cycle
        while (length > 0){
            s = s.next;
            length--;
        }
        //after that move both s and f one by one to get start
        while (f!=s){
            f = f.next;
            s=s.next;
        }
        return s;
    }
}
