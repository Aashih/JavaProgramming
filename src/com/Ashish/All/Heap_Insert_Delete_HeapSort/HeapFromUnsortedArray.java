package com.Ashish.All.Heap_Insert_Delete_HeapSort;

import java.util.ArrayList;

public class HeapFromUnsortedArray<T extends  Comparable<T>> {
    ArrayList<T> list;

    public HeapFromUnsortedArray() {
        list = new ArrayList<>();
    }

    public void add(T val){
        list.add(val);
    }
    private void swap(int first,int second){
        //itna to smjha ata hi hoga
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }

    private int parent(int index){
        return (index - 1) / 2;  //as given in copy (-1 isiliye because we want have given 0th index)
    }
    private int left(int index){
        return index*2 + 1;
    }
    private int right(int index){
        return index * 2 + 2;
    }

    public T remove() throws Exception{
        //throwing exception because if list is empty then throw exception
        if (list.isEmpty()){
            throw new Exception("Removing from empty heap is not allowd");
        }
        // to remove the element from heap
        //steps:
        //1.store the root (first element of heap) , because
        //we have to return that removed element at the end
        //2 . then remove the last element of of list and store it
        //in any variable
        //3. check if list is not empty:
        // then ;- list.set(0,last);
        //              and call downheap;(which maintain the propertu of
        //of min heap ( value(node) < all its child))
        T temp = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return  temp;
    }
    public void unsortedHeap(){
        int n = list.size();
        for (int i = n/2; i >=0 ; i--) {
            downheap(i);
        }
    }
    private void downheap(int index){
        int max = index;
        int left = left(index);
        int right = right(index);
        // this is the condition of max heap given in copy 
        if (left < list.size() && list.get(max).compareTo(list.get(left)) < 0){
            max = left;
        }
        if (right < list.size() && list.get(max).compareTo(list.get(right)) < 0){
            max = right;
        }

        if (max != index){
            swap(max,index);
            downheap(max);
        }
    }

    public static void main(String[] args) throws Exception {
      HeapFromUnsortedArray<Integer> l1 = new HeapFromUnsortedArray<>();
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(2);
        l1.add(16);
        l1.add(9);
        l1.add(14);
        l1.add(18);
        l1.add(7);

        l1.unsortedHeap();
        System.out.println(l1.remove());
    }
}
