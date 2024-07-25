package com.Ashish.All.Array;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int first = 1;
        int last = 3;
        int element = 6;
        System.out.println(range(arr,element,first,last));
    }
    static int range(int arr1[],int element , int f , int l){
        for (int i = f ; i<=l ; i++){
            if (arr1[i] == element){
                return i;
            }
        }
        return -1;
    }
}
