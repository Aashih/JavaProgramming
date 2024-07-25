package com.Ashish.All.Array;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1,112,3},
                {114,5,16,117},
                {128,19,10,11,12}
        };
        System.out.println(arraymax(arr));
    }
    static int arraymax(int[][] arr1){
        int max = arr1[0][0];
        for (int row=0 ; row<arr1.length ; row++){
            for (int col = 0 ; col<arr1[row].length ;col++){
                if (arr1[row][col] > max){
                    max = arr1[row][col];
                }
            }
        }
        return max;
    }
}
