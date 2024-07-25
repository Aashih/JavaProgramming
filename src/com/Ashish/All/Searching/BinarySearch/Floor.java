package com.Ashish.All.Searching.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int target = 20;
        System.out.println(fsearch(array,target));
    }
    static int fsearch(int[] arr, int element) {
        if (element < arr[0]){
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        boolean isAcs;
        isAcs = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == element) {
                return mid;
            } else if (isAcs) {
                if (element > arr[mid]) {
                    start = mid + 1;
                } else if (element < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (element > arr[mid]) {
                    end = mid - 1;
                } else if (element < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return arr[end];
    }
}
