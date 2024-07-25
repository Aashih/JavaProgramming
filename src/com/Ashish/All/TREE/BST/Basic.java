package com.Ashish.All.TREE.BST;

import com.Ashish.All.TREE.BinaryT.Main;
import org.w3c.dom.Node;

public class Basic {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;  // to check where the tree is balanced or not!

        public Node(int value) {
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    public Basic(){

    }
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if (node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if (value > node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left),height(node.right)) + 1;
//        (adding 1 is for the inserted item in the tree)
        return node;
    }
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    //if the arr[] = {1,2,3,4,5,6,7,8,9,10}
//    then we have to make a tree with it by three steps
    //1. take a start(points to very first element) and end(point last element and
    //find the mid of the array
    //2. After that insert the mid element
    //3. then recusivly call LHS first and find the mid element , insert it  and then repeat the process
    // also same for the  RHS
    public void populateSorted(int[] nums){
        populateSorted(nums,0,nums.length );
    }
    private void populateSorted(int[] nums,int start,int end){
        if (start >= end){
            return;
        }
        int mid = (start+end)/2;

        this.insert(nums[mid]); //step1
        populateSorted(nums,start,mid); //step2
        populateSorted(nums,mid+1,end); //step3

    }
    public boolean balanced(){
        return balanced(root);
    }
    public boolean balanced(Node node){
        if (node == null){  // tree with no node is balanced
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(this.root,"Root node :");
    }
    private void display(Node node,String details){
        if (node == null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left child of "+node.value+" : ");
        display(node.right,"Right child of "+node.value+" : ");
    }

}
