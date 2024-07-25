package com.Ashish.All.Recursion.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7,5,2,3,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr, int low,int heigh){
        if (low >= heigh){
            return;
        }
        int s = low;
        int e = heigh;
        int mid = s+(e-s)/2;
        int pivot = arr[mid];
        while (s<=e){
            while (arr[s] < pivot){  // continue this until we get the voilation
                s++;
            }
            while (arr[e] > pivot){  // continue this until we get the voilation
                e--;
            }
            if (s<=e){ // swaping will only takes place  when this condition satisfy
                int tem = arr[s];
                arr[s] = arr[e];
                arr[e] = tem;
                s++;
                e--;
            }
        }
        //after this we get pivot element in the correct index , so after this just sort the two half
        quick(arr,low,e);
        quick(arr,s,heigh);
    }
}
