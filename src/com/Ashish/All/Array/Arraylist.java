package com.Ashish.All.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> list1 = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<>(10);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(3);
        list.add(4);
        list.add(9);


        System.out.println(list);
//        System.out.println(list);
//        Object[] arr1 = list.toArray();
//        Arrays.sort(arr1);
//        System.out.println(Arrays.toString(arr1));


//        System.out.println(list2);


//        Scanner sc = new Scanner(System.in);
//        for (int i = 0 ; i<5 ; i++){
//            list.add(sc.nextInt());
//        }
//        int len = list.size();
//        System.out.println(list.get(0));
    }
}
