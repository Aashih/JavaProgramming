package com.Ashish.All.Heap_Insert_Delete_HeapSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
      Heap<Integer> list = new Heap<>();
      list.insert(8);
      list.insert(7);
      list.insert(9);
      list.insert(10);
      list.insert(11);
      list.insert(12);
      list.insert(14);
      list.insert(13);
      list.insert(15);

        System.out.println(list.remove());
        System.out.println(list.remove());
        System.out.println(list.remove());

        ArrayList<Integer> sorted = list.heapsort();
        System.out.println(sorted);
    }
}
