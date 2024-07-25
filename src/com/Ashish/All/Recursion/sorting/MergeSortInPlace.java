package com.Ashish.All.Recursion.sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergesort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
   static void mergesort(int[] arr,int s,int e){ //taking start and end instead of making a new array
        if (e - s == 1){
            return;
        }
        int mid = (s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid,e);

        merge(arr,s,mid,e);
   }
   static void merge(int[] arr,int s,int mid,int e){
        int[] mix = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;
        while(i < mid && j < e){ // this is used to store the element in the sorted order ! in mix array!
            if (arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
       }
        //is any element number of element in i != number of element in j
        while(i<mid){
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j<e){
            mix[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0 ; l<mix.length ; l++){
            arr[s+l] =  mix[l];
        }
   }
}
