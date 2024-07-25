package com.Ashish.All.Recursion.String;

import java.util.ArrayList;

public class SubsequenceTakingArrayListInFunctionBody {
    public static void main(String[] args) {
       ArrayList<String> list =  string("","abc");
        list.remove(list.size()-1); // used to remove space that is added at the end
        System.out.println(list);
    }
    static ArrayList<String> string(String p,String up){
       if (up.isEmpty()){
           ArrayList<String> list = new ArrayList<>(); // creating a new list which is has our answer
           list.add(p);
           return list;
       }
       char ch = up.charAt(0);
       ArrayList<String> left = string(p+ch,up.substring(1));
       ArrayList<String> right =string(p,up.substring(1));
       left.addAll(right);
       return left;
    }
}
