package com.Ashish.All.StackNQueue.Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Inbuilt {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println("Using deque");
        System.out.println();


        Deque<Integer> d1 = new ArrayDeque<>();
        d1.add(100);
        d1.addFirst(50);
        d1.addLast(200);
        d1.add(300);
        System.out.println(d1.getFirst());
        System.out.println(d1.getLast());
    }
}
