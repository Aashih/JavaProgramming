package com.Ashish.All.Recursion.Subset;

import java.util.ArrayList;
import java.util.List;

public class SubsetWithouRecursion {
    public static void main(String[] args) {
            int[] arr = {1, 2, 3};
            List<List<Integer>> ans = subset(arr);
//            List<List<Integer>> l1 = new ArrayList<>();
//            for (List<Integer> list : ans) {
//                System.out.println(list);
//            }
        System.out.println(ans);

        }
        static List<List<Integer>> subset( int[] arr){
            List<List<Integer>> outer = new ArrayList<>();
            outer.add(new ArrayList<>()); // creating a empty list inside the outer list
            for (int num : arr) { // taking every element in the array
                int n = outer.size(); // getting the size of the array
                for (int i = 0; i < n; i++) { // run a loop till the list outer
                    List<Integer> internal = new ArrayList<>(outer.get(i));  //copying the exixsting array
                    internal.add(num); //and add those elment in the internal list
                    outer.add(internal); // add the internal list in the outer
                }
            }
            return outer;
        }
    }

