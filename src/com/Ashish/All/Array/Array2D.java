package com.Ashish.All.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for (int row = 0 ; row< arr.length ; row++){
            for (int col = 0 ; col<arr[row].length ; col++){
                arr[row][col] = sc.nextInt();
            }
        }
        for (int row = 0 ; row< arr.length ; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
