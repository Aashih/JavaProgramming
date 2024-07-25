package com.Ashish.All.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr ) {
        int i = 0;
        while (i < arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else {
                i++;
            }
        }
    }
    static void swap(int[] arr ,int f , int s ){
        int tem = arr[f];
        arr[f] = arr[s];
        arr[s] = tem;
    }
}
