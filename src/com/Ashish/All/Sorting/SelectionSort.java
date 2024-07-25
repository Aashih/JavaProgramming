package com.Ashish.All.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] num ={4,5,1,2,3};
        sort(num);
        System.out.println(Arrays.toString(num));
    }
    static void sort(int[] arr){
        for(int i = 0 ; i <arr.length ; i++){
            int last = arr.length - i - 1;
            int max = index(arr,0 , last);
            swap(arr,max,last);
        }
    }
    static int index(int arr[] ,int start,int end){
        int max = start;
        for(int i = start ; i<= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int arr[],int first , int second){
        int tem = arr[first];
        arr[first] = arr[second];
        arr[second] = tem;
    }
//    static int select(int arr[]){
//        int n = arr.length;
//        for(int i = 0 ; i<arr.length ; i++){
//            for (int j = 1; j < n-i-1 ;j++){
//                if(arr[i] < arr[j]){
//                    arr[i] = arr[j];
//                }
//            }
//        }
//    }
}
