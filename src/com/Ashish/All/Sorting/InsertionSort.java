package com.Ashish.All.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }
            }
        }
    }
    static void swap(int arr[],int f,int s ){
        int tem = arr[f];
        arr[f] = arr[s];
        arr[s] = tem;
    }
}
