package com.Ashish.All.StackNQueue.Questions;

//https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

public class QuesUsingStack_RemoveEfficent {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QuesUsingStack_RemoveEfficent() {
        first = new Stack<>();
        second = new Stack<>();
    }
    public void add(int item){
        //Insetion can be done in O(n) time
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int remove() throws Exception{

        int popped = first.pop();
        return popped;
    }
    public int peek() throws Exception{
       return first.peek();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }
}
