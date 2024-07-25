package com.Ashish.All.StackNQueue.Stack.CustomNDynamicStack;

public class CustomStack {

    protected int[] data;

    int ptr = -1;
    private static final int DEFAULT_SIZE = 10;

    // we make it static beacuse it can be same for all the object of class CustomStack
    // final - because no one can cange it
    //private - because it can't be used in other class


    public CustomStack() {
        this(DEFAULT_SIZE);  // if we don't pass any size the by default it
//        call the below constructor
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){ // check whether the stack is full or not
            System.out.println("Stack is full");
            return false;
        }
        ptr++; // increase the ptr
        data[ptr] = item; //put item in the array at the ptr index
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot pop the item from stack");
            // thow an exception is the stack is empty
        }
        int val = data[ptr];
        ptr--;
        return val;
    }

    public int peek() throws StackException {
        if (isEmpty()){
            throw new StackException("Cannot peek the item from stack");
            // thow an exception is the stack is empty
        }
        return data[ptr];
    }
    public boolean isFull(){
        return ptr == data.length - 1;  // ptr is at the last index this means the sack is full
    }

    public boolean isEmpty(){
        return ptr == -1; //means stack is empty
    }
}
