package com.Ashish.All.Array;

//1.      *****
//        *****
//        *****
//        *****
//        *****

//2.      *
//        **
//        ***
//        ****
//        *****


//3.      *****
//        ****
//        ***
//        **
//        *


//4.      1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5


public class pattern1_5 {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println("1. ");
//        p1(n);
//        System.out.println("2. ");
//        p2(n);
//         p3(n);
//        p4(n);
        p5(n);
    }

    static void p1(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void p2(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  p3(int n){
        for (int i = n ; i>0 ; i--){
            for (int j = 0 ; j<i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void p4(int n){
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j<=i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

//5.      *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
    static void p5(int n){
        for (int row = 0 ; row<n ; row++){
            for (int col = 0 ; col<row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n ; i > 0 ;i--){
            for (int j = 0 ; j < i ; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}