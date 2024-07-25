package com.Ashish.All.HashMAp;

import java.util.HashSet;
import java.util.TreeMap;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //hashset don't tale any default values
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);
        set.add(60);
        System.out.println(set);

        System.out.println();
        TreeMap<String,Integer> tree = new TreeMap<>();
        //TreeMap stores items in sorted order

        tree.put("A",1);
        tree.put("B",2);
        tree.put("D",10);
        tree.put("C",3);
        tree.put("E",0);
        System.out.println(tree);
    }
}
