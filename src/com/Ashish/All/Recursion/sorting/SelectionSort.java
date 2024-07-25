package com.Ashish.All.Recursion.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,8,1};
        sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }
        if (c<r) {
            if (arr[c] > arr[max]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }
        } else {
            int tem = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = tem;
            sort(arr, r - 1, 0, 0);
        }
    }
}
    //Normal Method :-
//    static void sort(int[] arr){
//        for (int i = 0 ; i < arr.length ; i++){
//            int last = arr.length - i - 1 ;
//            int max = index(arr,0,last);
//            swap(arr , last , max);
//        }
//    }
//    static int index(int[] arr, int s , int e){
//        int max = 0;
//        for (int i = 0 ; i <= e ; i++){
//            if (arr[i] > arr[max]){
//                max = i;
//            }
//        }
//        return max;
//    }
//    static void swap(int[] arr,int f , int s){
//        int temp = arr[f];
//        arr[f] = arr[s];
//        arr[s] = temp;
//    }

    //Using com.Ashish.All.Recursion:-






