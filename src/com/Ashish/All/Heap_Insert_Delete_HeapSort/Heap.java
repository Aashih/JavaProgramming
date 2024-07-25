package com.Ashish.All.Heap_Insert_Delete_HeapSort;

import java.util.ArrayList;

//MIN HEAP
public class Heap<T extends Comparable<T>> {
    // for this we need to have class which is of generic type
    //[Gneric ni ata to gaand mara]
        private ArrayList<T> list;


        public Heap(){
            list = new ArrayList<>();
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
        //all this is explain very well in copy
        public void insert(T value){
            list.add(value);
            upheap(list.size() - 1);
        }
        public void upheap(int index){
            if (index == 0){ //means there is only one element in tree
                return;
            }
            int p = parent(index);
            //get the parent of the current index then compare them
            //if child  is less then the parent then swap
            //and again call uphead(p) till it reaches to root(index =0)
            if (list.get(index).compareTo(list.get(p)) < 0){
                swap(index,p);
                upheap(p);
            }
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
        private void downheap(int index){
            int min = index;
            int left = left(index);
            int right = right(index);

            //below code explaination given in copy
            if (left< list.size() && list.get(min).compareTo(list.get(left)) > 0){
                min = left;
            }
            if (right< list.size() && list.get(min).compareTo(list.get(right)) > 0){
                min = right;
            }
            if (min != index){
                swap(min,index);
                //continue this till the property of heap satisfies
                downheap(min);
            }
        }

        public ArrayList<T> heapsort() throws Exception{
            ArrayList<T> sorted = new ArrayList<>();
            while (!list.isEmpty()){
                sorted.add(this.remove());
            }
            return sorted;
        }



    }
