package com.Ashish.All.Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subset(new ArrayList<>(),arr,0);
    }
    static void subset(List<Integer> currentSubset, int[] arr, int index) {
        if (index == arr.length) {
            System.out.println(currentSubset);
            return;
        }

        // Include the current element
        List<Integer> subsetWithCurrent = new ArrayList<>(currentSubset);
        subsetWithCurrent.add(arr[index]);
        subset(subsetWithCurrent, arr, index + 1);

        // Exclude the current element
        subset(currentSubset, arr, index + 1);
    }
}
