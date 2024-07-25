package com.Ashish.All.Array;

public class MinNumArray {
    public static void main(String[] args) {
        int[] arr1 = {13, 32, 123, 74, 10};
        System.out.println("Minimum element is :" + minimum(arr1));
    }

    static int minimum(int[] arr) {
        int ans = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
