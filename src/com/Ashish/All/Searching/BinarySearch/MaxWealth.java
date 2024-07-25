package com.Ashish.All.Searching.BinarySearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int row = 0; row < accounts.length; row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++) {
                sum += accounts[row][col];
            }
            if (sum > ans) {
                ans = sum;
            }

        }
        return ans;
    }
}