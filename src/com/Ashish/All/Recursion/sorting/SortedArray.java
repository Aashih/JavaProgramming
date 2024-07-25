package com.Ashish.All.Recursion.sorting;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr = {0,1,5,3};
        System.out.println(sorted(arr,0));
    }
    static boolean sorted(int[] arr , int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
