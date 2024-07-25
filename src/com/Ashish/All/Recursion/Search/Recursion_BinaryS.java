package com.Ashish.All.Recursion.Search;

public class Recursion_BinaryS {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,9,45};
        int target = 45;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr , int target , int s ,int e){
        if (s>e){
            return -1;
        }
            int mid = s + (e - s)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (target>arr[mid]) {
                return search(arr, target, mid+1, e);
            }
        return search(arr,target,s,mid - 1);
    }
}
