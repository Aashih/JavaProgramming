package com.Ashish.All.Array;

import java.util.Arrays;

public class ReveseOfArray {
    public static void main(String[] args) {
        int[] arr1 = {5,4,3,2,1};
        System.out.println("Reverse of array is:");
        revese(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void revese(int[] arry){
        int start = 0;
        int end = arry.length-1;
        while (start<end){
            swap(arry,start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr , int i1, int i2){
        int tem = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tem;
    }
}
