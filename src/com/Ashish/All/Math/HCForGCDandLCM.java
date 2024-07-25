package com.Ashish.All.Math;

public class HCForGCDandLCM {
    public static void main(String[] args) {
        int a = 8;
        int b = 20;
        System.out.println("HCF = "+gcd(a,b));
        System.out.println("LCM = "+lcm(a,b));
    }
    //to find hcf or gcd = means the greatest number which can be divided by both a and b
//    example hcf(8,12) = 4 , 4 is a greatest number divisible by 8 and 12

    static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a); //Enclidean Algorithm
    }
    //to find lcm = least Common factor:-
//                   lcm(a,b) = minimum number divisible by both a and b
//                     example = lcm(2,4) = 4 , lcm(3,7) = 21
    static int lcm(int a , int b){
        int ans = (a * b)/gcd(a,b);
        return ans;
    }
}
