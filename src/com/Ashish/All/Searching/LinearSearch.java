package com.Ashish.All.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        System.out.println(lsearch(arr,4));
    }
    static int lsearch(int arr[] , int element){
        if (arr.length == 0){ //If lenght of array is 0
            return -1;
        }
        for (int i = 0 ; i<arr.length ; i++){
            if (arr[i] == element){
                return i;
            }
        }
        return -1; //If none of the above is true (-1 means value not found)
    }
}
