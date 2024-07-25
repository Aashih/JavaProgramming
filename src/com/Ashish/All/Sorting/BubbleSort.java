package com.Ashish.All.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
    static void bubble(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = 1 ; j <= arr.length-i-1 ; j++){
                if (arr[j] < arr[j-1]){
                    int tem =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tem;
                }
            }
        }
    }
}
