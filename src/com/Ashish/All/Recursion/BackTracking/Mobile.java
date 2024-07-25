package com.Ashish.All.Recursion.BackTracking;

import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        ArrayList<String> ans = pad("","12");
        System.out.println(ans);
        System.out.println(padcount("","132"));
    }

    //    static void pad(com.Ashish.All.String p , com.Ashish.All.String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        int digit = up.charAt(0) - '0';
//        for (int i=(digit-1)*3 ; i<digit*3;i++){
//            char ch = (char)('a'+i);
//            pad(p+ch,up.substring(1));
//        }
//    }
    //Using ArrayList:
    static ArrayList<String> pad(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> result = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            result.addAll(pad(p + ch, up.substring(1)));
        }
        return result;
    }

    static int padcount(String p , String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int digit = up.charAt(0) - '0';
        ArrayList<String> result = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            count = count + padcount(p + ch, up.substring(1));
        }
        return count;
    }
}
