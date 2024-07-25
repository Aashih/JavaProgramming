package com.Ashish.All.Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetOfArrayPassingInArgument {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subset(new ArrayList<>(),arr,0);

        System.out.println(ans);
    }
    static List<List<Integer>> subset(List<Integer> p,int[] up , int i){
        if (i == up.length){
            List<List<Integer>> ans =new ArrayList<>();
            ans.add(p);
            return ans;
        }
        List<Integer> list = new ArrayList<>(p);
        list.add(up[i]);
        List<List<Integer>> left = subset(list,up,i+1);
        List<List<Integer>> right = subset(p,up,i+1);
        left.addAll(right);
        return left;
    }
}
