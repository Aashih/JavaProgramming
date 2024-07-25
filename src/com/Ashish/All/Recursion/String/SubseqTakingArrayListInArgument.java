package com.Ashish.All.Recursion.String;

import java.util.ArrayList;

public class SubseqTakingArrayListInArgument {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> list = subseq("",str,new ArrayList<>());
        list.remove(list.size()-1); // used to remove space that is added at the end
        System.out.println(list);

    }
    static ArrayList<String> subseq(String p,String up,ArrayList<String> list){
        if (up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch = up.charAt(0); // to get the first char of every string
        list=  subseq(p+ch,up.substring(1),list); // taking that char
        list =  subseq(p,up.substring(1),list); //ignoring that char
        return list;
    }
}

