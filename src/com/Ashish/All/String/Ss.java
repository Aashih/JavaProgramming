package com.Ashish.All.String;

import java.util.Arrays;

public class Ss {
    public static void main(String[] args) {
        int[] arr = {7,9,6,2,3,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0 ; i <arr.length ; i++){
            int last = arr.length - i -1;
            int maxIndex = index(arr,0,last);
            swap(arr,last,maxIndex);
        }
    }
    static int index(int[] arr,int start,int end){
        int max = start;
        for(int i = start ; i <= end ; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int arr[],int f , int s){
        int tem = arr[f];
        arr[f] = arr[s];
        arr[s] = tem;
    }
}
