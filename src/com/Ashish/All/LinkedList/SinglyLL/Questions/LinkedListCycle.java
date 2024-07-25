package com.Ashish.All.LinkedList.SinglyLL.Questions;

import org.w3c.dom.Node;

//LEETCODE 141 https://leetcode.com/problems/linked-list-cycle/
public class LinkedListCycle {
    //SEE THE EXPLAINATION IN COPY AND THE CODE BY CLICKING ABOVE CODE
   private Node head;
   class ListNode {
       int value;
       ListNode next;

       public ListNode(int value) {
           this.value = value;
       }

       public ListNode(int value, ListNode next) {
           this.value = value;
           this.next = next;
       }

       public boolean hasCycle(ListNode head) {
           ListNode fast = head;
           ListNode slow = head;

           while (fast != null && fast.next != null) {
               fast = fast.next.next;
               slow = slow.next;
               if (fast == slow) {
                   return true;
               }
           }
           return false;
       }

       // find length of the cycle
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
   }
}
