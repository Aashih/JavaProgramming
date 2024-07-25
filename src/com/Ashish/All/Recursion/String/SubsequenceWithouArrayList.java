package com.Ashish.All.Recursion.String;

public class SubsequenceWithouArrayList {
        public static void main(String[] args) {
            String str = "abc";
            subseq("",str);
        }
        static void subseq(String p,String up){
            if (up.isEmpty()){
                System.out.println(p);
                return;
            }
            char ch = up.charAt(0); // to get the first char of every string
            subseq(p+ch,up.substring(1)); // taking that char
            subseq(p,up.substring(1)); //ignoring that char
        }
    }

