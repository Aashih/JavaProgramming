package com.Ashish.All.Basic;

public class Triplet {
    public static void main(String[] args) {
        int n1 = 3 , n2 = 4 , n3 = 5;
        pyth(n1,n2,n3);
    }
    static void  pyth(int a , int b , int c){
        a=a*a;
        b=b*b;
        c=c*c;
        int sum = a+b;
        if (sum==c){
            System.out.println(" pythagorean Triplet");
        }
        else {
            System.out.println(a+","+b+","+c+" not pythagorean Triplet" );
        }
    }
}
