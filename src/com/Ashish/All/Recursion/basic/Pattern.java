package com.Ashish.All.Recursion.basic;

public class Pattern {
    public static void main(String[] args) {
        int n = 4;
//        ReverseTriangle(n,0);
        normalTriangle(n,0);
    }

    //Normal method
//    static void ReverseTriangle(int n){
//        for (int i = 1 ; i <= n ; i++){
//            for (int j = n ; j>=i ; j--){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
    //Using recursion
//    static void ReverseTriangle(int r,int c){
//        if (r==0){
//            return;
//        }
//        if (r > c){
//            System.out.print("* ");
//            ReverseTriangle(r,c+1);
//        }else {
//            System.out.println();
//            ReverseTriangle(r-1,0);
//        }
//    }
    static void normalTriangle(int r,int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            normalTriangle(r, c + 1);
            System.out.print("* ");
        } else {

            normalTriangle(r - 1, 0);
            System.out.println();
        }
    }
}
