package com.Ashish.All.TREE.AVLtree;

public class Main {
    public static void main(String[] args) {
        Concept tree = new Concept();
        int[] arr ={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            tree.insert(arr[i]);
        }
        tree.display();
        System.out.println(tree.height());  //Now we are balancing it while inserting an element so the height will be O(logN);
    }
}
