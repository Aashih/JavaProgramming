package com.Ashish.All.Recursion.BackTracking;

import java.util.ArrayList;

public class MazeWays {
    public static void main(String[] args) {
//        ways("",3,3);
        ArrayList<String> ans = ways("",3,3);
//        ArrayList<String> ans2 = waysdaigonal("",3,3);
        System.out.println(ans);
//        System.out.println(ans2 );
    }
//    static void ways(String p,int r , int c){
//        if (r==1 && c==1){
//            System.out.println(p);
//            return;
//        }
//        if (r > 1) {
//            ways(p + "D", r - 1, c);
//        }
//        if (c>1)
//        ways(p+"R",r,c-1);
//
//    }
//    Using ArrayList:
    static ArrayList<String> ways(String p , int r , int c){
        if (r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();
        if (r>1){
             list.addAll(ways(p+"V",r-1,c));
        }
        if (c>1){
           list.addAll(ways(p+"H",r,c-1));
        }


        return list;
    }

//    static ArrayList<String> waysdaigonal(String p , int r , int c){
//        if (r==1 && c==1){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        ArrayList<String> list = new ArrayList<>();
//        if (r>1){
//            list.addAll(waysdaigonal(p+"V",r-1,c));
//        }
//        if (c>1){
//            list.addAll(waysdaigonal(p+"H",r,c-1));
//        }
//        if (r>1 && c>1){
//            list.addAll(waysdaigonal(p+"D",r-1,c-1));
//        }
//        return list;
//    }
}
