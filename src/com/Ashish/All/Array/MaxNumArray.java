package com.Ashish.All.Array;

public class MaxNumArray {
    public static void main(String[] args) {
        int[] arr = {};
        max(arr);
    }

    static void max(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Empty");
        } else {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Maximum element is: " + max);
        }
    }
}
