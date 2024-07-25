package com.Ashish.All.Searching.BinarySearch;

import java.util.Arrays;

public class RowColBS {
    public static void main(String[] args) {
        int[][] arry = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int des = 96;
        System.out.println(Arrays.toString(search(arry, des)));
    }
    static int[] search(int[][] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start < arr.length && end >= 0){
            if (arr[start][end] == target){
                return new int[]{start,end};
            }
            if(arr[start][end] < target){
                start++;
            }
            else {
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
