package com.Ashish.All.Math;

public class Sqrt {
    public static void main(String[] args) {
        int n =40;
        int ans = 0;

//        T.C =O(N)
        for (int i = 1 ; i <= n/2 ; i++){
            if (i*i <= n){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
