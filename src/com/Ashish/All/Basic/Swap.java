package com.Ashish.All.Basic;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        swap(arr1,2,4);
    }
    static void swap(int[] arr , int i1 ,int i2){
        int tem = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tem;
        System.out.println(Arrays.toString(arr));
    }
}
