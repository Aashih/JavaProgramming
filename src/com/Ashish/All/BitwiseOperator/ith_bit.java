package com.Ashish.All.BitwiseOperator;

public class ith_bit {
    public static void main(String[] args) {
        int num=4;
        int i = 2;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(bit(num,i));
    }
    static int bit(int n , int i){
        int ans = n & (1<<(i-1));
        return ans;
    }
}
