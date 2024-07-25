package com.Ashish.All.String;

import java.util.Arrays;

public class StringPalindrom {
    public static void main(String[] args) {
        String[] str ={"flower","flow","ight"};
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        char[] chr = str[0].toCharArray();
        System.out.println(Arrays.toString(chr));
    }

    static boolean palin(String str) {
        str = str.toLowerCase();
        if(str.length() == 0 || str == null){
            return true;
        }
       int start = 0;
        int end = str.length() -1;
        while(start <= end){
            char s = str.charAt(start);
            char e = str.charAt(end);
            if (s != e){
                return false;            }
            start++;
            end--;
        }
        return true;
    }
}
