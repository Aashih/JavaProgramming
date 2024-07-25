package com.Ashish.All.Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        rotate2(arr,3);
        for (int i = 0 ; i< arr.length ;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void rotate(int[] arr){
        int tem = arr[0];
        for (int i = 1 ; i<arr.length ; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = tem;
    }
    static void rotate2(int[] arr,int k){
        k = k%arr.length;
        if (k<0){
            k = k + arr.length;
        }
        for(int i = 1 ; i <=k ; i++){
            rotate(arr);
        }
    }
}
