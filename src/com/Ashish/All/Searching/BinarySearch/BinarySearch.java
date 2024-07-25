package com.Ashish.All.Searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90};
        int target = 60;
        System.out.println("Element found at index : " +Bsearch(array,target));
    }
    static int Bsearch(int[] arr, int element) {
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
        return -1;
    }
}
