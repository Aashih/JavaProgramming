package com.Ashish.All.Recursion.Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetForDuplicateElementInArray {
    public static void main(String[] args) {
        int[] arr ={4,4,4,1,4};
        List<List<Integer>> ans = subset(arr);
//      for(List<Integer> list : ans){
//          System.out.println(list);
//      }
        System.out.println(ans);
    }
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0 ;
        int end  = 0;
        for (int i = 0 ; i < arr.length ; i++){
            start = 0;
            //If current and prev. element is same s = e+1;
            if (i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1; 
            int n = outer.size();
            for (int j= start ; j<n ; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j)); //copying the array which is newly added
                internal.add(arr[i]); // adding the newely formed List
                outer.add(internal); //Adding all the List in the outer list
            }
        }
        return outer;
    }
}
