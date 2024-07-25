package com.Ashish.All.Basic;

public class Amstrng2 {
    public static void main(String[] args) {
        int low = 99 , high = 999;
        for (int num = low+1 ; num<high ; num++) {
            int digit =0;
            int result = 0;
            int original = num;
            original = num;
            while (original != 0) {
                original /= 10;
                ++digit;
            }
            original = num;
            while (original != 0) {
                int rem = original % 10;
                result += (int) Math.pow(rem, digit);
                original /= 10;
            }
            if (result == num) {
                System.out.println(num+" ");
            }
        }
        }
    }

