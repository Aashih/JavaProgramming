package com.Ashish.All.Basic;

import java.util.Arrays;

public class PassingValueOfReferenceVariable {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        chng(arr);
        System.out.println(Arrays.toString(arr));
    } //Value will be change in main function and the calling function as well
    static void chng(int[] arr){
        arr[0] = 10;
        System.out.println(Arrays.toString(arr));
    }
}
