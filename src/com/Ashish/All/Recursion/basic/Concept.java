package com.Ashish.All.Recursion.basic;

public class Concept {
    public static void main(String[] args) {
        int n = 10;
       prnt(n);
    }
    static void prnt(int n){
        if (n == 0){
            return;
        }
        System.out.print(n+" ");
//        prnt(n--);//trows an error goes into infinite loop
        prnt(--n);
    }
}
