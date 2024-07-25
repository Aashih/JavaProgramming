package com.Ashish.All.BitwiseOperator;

public class NoOfSetBit {
    public static void main(String[] args) {
        int n = 15 ;
        int count=0;
        while(n>0){
            int last = n & 1;
            if (last==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }
}
