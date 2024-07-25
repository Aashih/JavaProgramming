package com.Ashish.All.StackNQueue.Questions;

//https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

public class QueueUsingStack_InsertEfficently {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack_InsertEfficently() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        first.push(item); //Insetion can be done in O(1) time
    }
    public int remove() throws Exception{
        //this can be done in O(n) time
        while (!first.isEmpty()){
            second.push((first.pop()));
        }
        int popped = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return popped;
    }
    public int peek() throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
