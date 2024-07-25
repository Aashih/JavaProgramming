package com.Ashish.All.Recursion.basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(prime(n,2));
    }

    static boolean prime(int n, int i) {
        if (n <= 2) {
            if (n == 2) {
                return true;
            } else {
                return false;
            }
        } else if (n % i == 0) {
            return false;
        } else if (i * i > n) {
            return true;
        }
        return prime(n, i + 1);
    }

}
