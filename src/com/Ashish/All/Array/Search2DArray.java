package com.Ashish.All.Array;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {8,9,10,11,12}
        };
        System.out.println(arr.length);
        int element = 6;
        int[] ans = search2d(arr,element);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search2d(int[][] arr1 ,int element){

        for (int row = 0 ; row<arr1.length ; row++){
            for (int col=0 ; col<arr1[row].length ;col++){
                if (arr1[row][col] == element){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
