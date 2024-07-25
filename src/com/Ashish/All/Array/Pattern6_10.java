package com.Ashish.All.Array;

public class Pattern6_10 {
    public static void main(String[] args) {
        int n = 5;
//        p6(n);
//        prac7(n);
        prtn11(n);
    }
//
//    6.        *
//             **
//            ***
//           ****
//          *****

    static void p6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    //7.  *****
//         ****
//          ***
//           **
//            *
    static void prac7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col < row) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

//    8.      *
//            *****
//            *****
//            *******
//            *********

    static void prac8(int n){
        for (int row =1 ; row<= n ; row++){
            for (int col = 1 ; col<= n - row ; col++){
                System.out.print(" ");
            }
            for (int k = 1 ; k<= 2*(row) - 1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
//    9.      *********
//             *******
//              *****
//               ***
//                *
    static void prac9(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    10.       *
//             * *
//            * * *
//           * * * *
//          * * * * *
    static void ptern10(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//    11.    * * * * *
//            * * * *
//             * * *
//              * *
//               *
    static void prtn11(int n){
        for (int i = n; i >=0 ; i--) {
            for (int j = 1; j <= n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
