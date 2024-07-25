package com.Ashish.All.Recursion.String;

import java.util.ArrayList;

public class SubseqAscii {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> ans = sub(str,"");
        System.out.println(ans);
    }
    static ArrayList<String> sub(String original ,String current){
        if (original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(current);
            return list;
        }
        char ch = original.charAt(0);
        ArrayList<String> left = sub(original.substring(1),current+ch);
        ArrayList<String> right = sub(original.substring(1),current);
        ArrayList<String>  ascii = sub(original.substring(1),current+(0+ch));
        left.addAll(right);
        left.addAll(ascii);
        return left;
    }
}
