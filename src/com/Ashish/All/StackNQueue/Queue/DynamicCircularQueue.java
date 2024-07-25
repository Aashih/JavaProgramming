package com.Ashish.All.StackNQueue.Queue;

public class DynamicCircularQueue extends CircularQueue {
    DynamicCircularQueue(){
        super();
    }
    DynamicCircularQueue(int size){
        super(size);
    }

    @Override
    public boolean insert(int n) {
        if (isfull()){
            int[] temp = new int[data.length*2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i ) % data.length];
                //(front + i) % data.length means we are starting from front
                //because front points our very first item in our circular queue
                //% data.length is used because when f exceeds the length of array the by using % we
                //manage it for exmple - if arr.length = 5; f = 5 ; then f = 5%5 == 0 ;
            }
            front = 0;
            end = data.length;
            data =temp;
        }
        return super.insert(n);
    }
}
