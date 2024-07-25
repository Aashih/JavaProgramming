package com.Ashish.All.Recursion.Search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5};
        System.out.println(search(arr,3, 0));
    }
    static int search(int[] arr,int num,int index) {
        if (arr.length == index) {
            return index;
        }
        if (arr[index] == num){
            return index;
        }
        return search(arr, num, index + 1);
    }
}
