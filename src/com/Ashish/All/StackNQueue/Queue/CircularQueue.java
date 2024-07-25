package com.Ashish.All.StackNQueue.Queue;

import com.Ashish.All.Array.C;

public class CircularQueue {
    protected int[] data;

    private static final int DEFAULT_SIZE = 10;
    int front = 0 ;
    int end = 0 ;
    int size = 0;
    public CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int n){
        if (isfull()){
            return false;
        }
        data[end++] = n;  // insert an element at end then increment it
        end = end % data.length;  //when end == data.length the it will again go to 0th index
        size++;
        return true;
    }
    public int remove() throws Exception {
        if (isempty()) {
            throw new Exception("Cannot remove from empty queue");
        }
        int removed = data[front++]; // store the element at front and icrement it
        front = front % data.length;
        size--;
        return removed;
    }
    public int front() throws Exception {
        if (isempty()){
            throw new Exception("Cannot remove from empty queue");
        }
        return data[front];
    }

    public void display(){
        if (isempty()){
            System.out.println("Queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while (i != end);  // when i == e means we have traversed entire array
        System.out.print("END");
    }
    public boolean isfull(){
        return size == data.length;
    }
    public boolean isempty(){
        return size == 0;
    }
}
