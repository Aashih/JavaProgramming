package com.Ashish.All.StackNQueue.Queue;

public class CustomQueue {
    int[] data;
    int end = 0 ; //because here we are adding the item at the end
                  // nd then increase it
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int n){
        if (isfull()){
            return false;
        }
        data[end] = n;
        end++;
        return true;
    }
    public int remove() throws Exception {
        if (isempty()){
            throw new Exception("Cannot remove from empty queue");
        }
        int num = data[0];
        for (int i = 1; i < end ; i++) {
            data[i-1] = data[i];  //shifting all the element to LHS by one!
        }
        end--;
        return num;
    }
    public int front() throws Exception {
        if (isempty()){
            throw new Exception("Cannot remove from empty queue");
        }
        return data[0];
    }
    public boolean isfull(){
        return end == data.length;
    }
    public boolean isempty(){
        return end == 0;
    }
    
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i]+" <- ");
        }
        System.out.print("END");
    }
}
