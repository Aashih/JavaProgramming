package com.Ashish.All.Recursion.String;

public class CountPerm {
    public static void main(String[] args) {
        String str ="abc";
        System.out.println(per("",str));
    }
    static int per(String p , String up){
        if (up.isEmpty()){
            return 1;
        }
        int count =0;
        char chr = up.charAt(0);
        for (int i = 0; i <=p.length(); i++) {
                String f = p.substring(0,i);
                String s = p.substring(i,p.length());
                count= count + per(f+chr+s,up.substring(1));
        }
        return count;
    }
}
