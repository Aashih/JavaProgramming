package com.Ashish.All.Math;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        int n = 20;
//        fact1(n);
        fact2(n);
    }
    //Brute Force - time =      O(n)
    static void fact1(int n){
        for (int i = 1; i <= 20; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //Optimal approach = Time & space - O(sqrt(n))
    static void fact2(int n) {
        ArrayList<Integer> lis = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                if (n / i == i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    lis.add(n/i);
                }
            }
        }
        for (int i = lis.size()-1 ; i>=0 ; i--){
            System.out.print(lis.get(i)+" ");
        }
    }
}
