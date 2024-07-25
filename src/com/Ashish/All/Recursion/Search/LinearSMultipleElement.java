package com.Ashish.All.Recursion.Search;

import java.util.ArrayList;

public class LinearSMultipleElement {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,3,7,3};
        int element = 3;
        System.out.println(search(arr,element,0));
//        search(arr,element,0);
//        System.out.println(list);
    }
//    static ArrayList<Integer> list = new ArrayList<>();
//    static int search(int[] arr , int element ,int index){
//        if (index == arr.length){
//            return -1;
//        }
//        if (arr[index] == element){
//            list.add(index);
//        }
//        return search(arr,element,index+1);
//    }

    //By passing ArrayList in the Argument
//    static ArrayList<Integer> search(int[] arr ,int element , int index , ArrayList<Integer> list){
//        if (arr.length == index) {
//            return list;
//        }
//        if (arr[index] == element){
//            list.add(index);
//        }
//        return search(arr, element, index+1, list);
//    }

    //If we won't pass the ArrayList as the argument and still wnat to print the array list
    static ArrayList<Integer> search(int[] arr, int element,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == index){
            return list;
        }
        if (arr[index] == element){
            list.add(index);
        }
        ArrayList<Integer> ans = search(arr,element,index+1);
        list.addAll(ans);
        return list;
    }
}
