package com.Ashish.All.Recursion.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

public class PermutationString {
    public static void main(String[] args) {
        String str = "abc";
//        ArrayList<String> result = per("",str);
//        System.out.println(per("", str));
    }
//    static void per(String p ,String up){
//        if (up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        char chr = up.charAt(0);
//        for (int i = 0 ; i <= p.length() ;i++){
//            String f = p.substring(0,i);
//            String s = p.substring(i,p.length());
//
//           per(f+chr+s,up.substring(1 ));
//        }
    // Using ArrayList :
    static ArrayList<String> per(String p , String up){
          if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        // for example we have taken up = "abc"
        //so frist we will take a
        //then take another next char b and
        //b can be placed either _a or either a_
        //and then when we take char c
        // c can be placed _ab , a_b , ab_ or _ba , b_a , ba_

        char chr = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i <= p.length() ; i++) { // this loop is to place char in postion as shown above
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            ans.addAll(per(f+chr+s,up.substring(1)));
        }
        return ans;
    }
}
