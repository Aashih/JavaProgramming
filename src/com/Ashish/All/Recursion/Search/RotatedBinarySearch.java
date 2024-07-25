package com.Ashish.All.Recursion.Search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,1,2,3};
        System.out.println(search(arr,0,arr.length-1,2));
    }
    static int search(int[] arr,int s , int e , int element){
        if (s>e){
            return -1;
        }
        int mid = s + (e - s)/2;
        if (arr[mid] == element){
            return mid;
        }
       if (arr[s] <= arr[mid]){
           if (element >= arr[s] && element <= arr[mid]){
               return search(arr,s,mid-1,element);
           }else{
               return search(arr,mid+1,e,element);
           }
       } else if (element >= arr[mid] && element <= arr[e]) {
           return search(arr,mid+1,e,element);
       }
       return search(arr,s,mid-1,element);
    }
}
