package com.Ashish.All.Recursion.basic;
import java.util.ArrayList;
public class ArrayListRecursion {
    public static void main(String[] args) {
        int[] arr = {1,4,2,6,7,2};
        int target = 2;
      ArrayList<Integer> ans = linear(arr,target,0);
        System.out.println(ans);
    }
    static ArrayList<Integer> linear(int[] arr , int target,int i){
        ArrayList<Integer> list = new ArrayList<>();
        if (i == arr.length){
            return list;
        }if (arr[i] == target){
           list.add(i);
        }
        ArrayList<Integer> below = linear(arr,target,i+1);
        list.addAll(below);
        return list;
    }
}
