package com.Ashish.All.Math;
//To find prime from 0 till n
public class Prime {
    public static void main(String[] args) {
        int n = 40;
        for (int i = 2 ; i <= n ; i++){
          if (prime(i)!=-1){
              System.out.print(i+" ");
          }
        }
    }
    static int prime(int n){
        if (n<=1){
            return -1;
        }
        int c = 2;
        while(c*c<=n){
            if (n % c == 0){
                return -1;
            }
            c++;
        }
        return n;
    }
}
