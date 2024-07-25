package com.Ashish.All.Sorting;

import java.util.Arrays;

public class RadixSorT {
    public static void radixSort(int[] arr) {

        //shortcut to find the max of array
        int max = Arrays.stream(arr).max().getAsInt();

        // do count sort for every digit place
        for(int exp = 1; max/exp > 0; exp *= 10) {
            countSort(arr, exp);
        }
    }

    private static void countSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n]; //this will store our sorted array
        int[] count = new int[10]; //this will count the element occurence

        Arrays.fill(count, 0); //intially all count will be zero

        for(int i=0; i<n; i++) {
            count[(arr[i] / exp) % 10]++; //increase the index of count by 1 when we have element in the arr
        }

        System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

        for(int i=1; i<10; i++) {
            count[i] = count[i] + count[i-1]; //add the count with the previ index , so that we will know which element to put in which place
        }

        System.out.println("Updated count array " + Arrays.toString(count));

        //perform the radix sort for every digit place
        for(int i=n-1; i>=0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.out.println("Output array " + Arrays.toString(output));

        System.arraycopy(output, 0, arr, 0, n);

    }

    public static void main(String[] args) {
        int[] arr = {29, 83, 471, 36, 91, 8};

        System.out.println("Origin array: " + Arrays.toString(arr));
        radixSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
