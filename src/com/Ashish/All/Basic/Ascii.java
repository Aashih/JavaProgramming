package com.Ashish.All.Basic;

public class Ascii {
    public static void main(String[] args) {
//        com.Ashish.All.String ch = "abc";
////        int asc = ch.charAt(0);
//        System.out.println(asc);
        char ch = '9';
        System.out.println(ch + 0);
        int digit = ch - '0';
        System.out.println(digit);
        int i = 'a';
        int chr = i + 1;
        System.out.println(chr);
        char an = (char) chr;
        System.out.println(an);
        for (int n = 0; n <= 4; n++) {
            char result = (char) ('a' + n);
            System.out.println(result);
        }
    }
}
