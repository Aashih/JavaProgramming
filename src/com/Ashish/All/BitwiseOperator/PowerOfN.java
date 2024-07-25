package com.Ashish.All.BitwiseOperator;

public class PowerOfN {
    public static void main(String[] args) {
        double base= 2.000;
        int power=-2;
        double ans = 1;
        
        while (power>0){
            int last = power & 1;
            power = power >> 1;
            if (last!=0) {
                ans *= last * base;
            }

            base = base * base;

        }
        System.out.println(ans);
    }
}
