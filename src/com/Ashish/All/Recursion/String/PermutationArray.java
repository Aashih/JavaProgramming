package com.Ashish.All.Recursion.String;

import java.util.ArrayList;
import java.util.List;

public class PermutationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>(); // to store the every permutation
        List<Integer> ds = new ArrayList<>(); // store permutation at every recursive call
        boolean[] feq = new boolean[arr.length]; //check whether the element is taken not
        per(ans,ds,arr,feq);
        System.out.println(ans);
    }

    public static void per(List<List<Integer>> ans,List<Integer> ds,int[] arr,boolean[] feq){
    if (ds.size() == arr.length){ // no explaination needed lvde itna to ata hi hoga
        ans.add(new ArrayList<>(ds));
        return;
    }
        for (int i = 0; i < arr.length; i++) {
            if (!feq[i]){ // if flase means that element is not take
                feq[i] = true; // then take it
                ds.add(arr[i]); //add it to the ds
                per(ans,ds,arr,feq); // recursivly call
                ds.remove(ds.size()-1);
                feq[i] = false;
            }
        }
    }
}

