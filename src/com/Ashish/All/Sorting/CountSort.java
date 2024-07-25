package com.Ashish.All.Sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,3,1,0};
//        cont(arr);
        countHash(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Noraml Approch
     public static void cont(int[] arr){
        if (arr.length<=1){
            return;
        }
        int max = arr[0];
        //step1: find max
        for(int num:arr){
            if (num>max){
                max = num;
            }
        }
        int[] countArray = new int[max+1];
        //step2 : Create freq array
        for(int num:arr){
            countArray[num]++;
        }

        //setp 3: replace the original array and while countArry(index>0)
        //then add index to the original array(arr)
        int index = 0;
        for (int i = 0; i <= max; i++) {
            while (countArray[i] > 0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }
    }

    //Optimizes approch - Using hashmap
    public static void countHash(int[] arr){
        if (arr.length <= 1){
            return;
        }
        //shortcut to get max element from array
        int max = Arrays.stream(arr).max().getAsInt();

        Map<Integer,Integer> map = new HashMap<>();

        //putting the number and its occurence
        for (int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        //getting occurence of number and modifying the original array
        int index = 0;
        for (int i = 0; i <= max; i++) {
            int count = map.getOrDefault(i,0);
            for (int j = 0; j < count; j++) {
               arr[index] = i;
               index++;
            }
        }
    }
}
