package com.Ashish.All.Recursion.sorting;

import java.util.Arrays;

public class MergeSortNewArray {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){

        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid)); //Creating a copy of left array
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length)); // Creating a copy of right array
        return merge(left,right); // Using step 3
    }
    static int[] merge(int[] left , int[] right){
        int[] mix = new int[left.length+right.length];
        int i = 0 ;
        int j = 0;
        int k = 0 ;
        while (i<left.length && j<right.length){
            if (left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }
            else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k] = left[i];
            k++;
            i++;
        }
        while(j<right.length){
            mix[k] = right[j];
            k++;
            j++;
        }
        return mix;
    }
}
