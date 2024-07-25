package com.Ashish.All.TREE.BST;

public class Main {
    public static void main(String[] args) {
        Basic tree = new Basic();
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println(nums.length);
        tree.populateSorted(nums);
        System.out.println();
        System.out.println(tree.height());
//        tree.populate(nums);
        tree.display();
        System.out.println(tree.balanced());
    }
}
