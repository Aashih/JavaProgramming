package com.Ashish.All.Math;

public class BinarySqrt {
    public static void main(String[] args) {
        int n = 40;
        int p = 3; // means pricision use to give exact value of root(n)
        System.out.printf("%.3f",sqrt(n,p));
    }

    //Time : O(logn)
    static double sqrt(int n,int p){
        int s = 0 ;
        int e = n;
        while(s <= e){
            int mid = s + (e - s)/2;
            if (mid*mid == n){
                return mid;
            } else if (mid*mid > n) {
                e = mid -1;
            }else{
                s = mid + 1;
            }
        }
        double root = 0.0;
        double inc = 0.1;
        for (int i = 0 ; i<p ;i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }
}
