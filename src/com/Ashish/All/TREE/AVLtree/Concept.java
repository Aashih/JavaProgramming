package com.Ashish.All.TREE.AVLtree;


import com.Ashish.All.TREE.BST.Basic;

public class Concept {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;  // to check where the tree is balanced or not!

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;

    public Concept() {

    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value,root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        }
        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
//        (adding 1 is for the inserted item in the tree)
        return rotate(node);   //the fuction itself rotate the tree and then return the node
    }
    private Node rotate(Node node){
        if (height(node.left) - height(node.right) > 1) {
            //Left heavy
            if (height(node.left.left) - height(node.left.right) > 0) {
                //then perform LL rotation
                return rightRotate(node);
            }
            if (height(node.left.left) - height(node.left.right) < 0) {
                //then perfrom LR rotation
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if (height(node.left) - height(node.right) < -1) {
            //Right heavy
            if (height(node.right.left) - height(node.right.right) < 0) {
                //perform RR rotation
                return leftRotate(node);
            }
            if (height(node.right.left) - height(node.right.right) > 0) {
                //perform RL rotation
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }
        return node;
    }
    public Node rightRotate(Node p){
        //Just code what is give in the copy that's all
        //assign the node
        Node c = p.left;
        Node t = c.right;

        //Rotate
        c.right = p;
        p.left =t;

        //Updates the heights now
        p.height = Math.max(height(p.left),height(p.right) + 1);
        c.height = Math.max(height(c.left),height(c.right) + 1);

        return c; // return new node
    }

    public Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        //rotate
        p.left = c;
        c.right = t;

        p.height = Math.max(height(p.left),height(c.right)+1);
        c.height = Math.max(height(c.left),height(c.right)+1);
        return p;
    }
    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void display(){
        display(this.root,"Root node : ");
    }
    private void display(Node node, String indent){
        if (node == null){
            return;
        }
        System.out.println(indent+node.value);
        display(node.left,"left child of "+node.value+" : " );
        display(node.right,"Right child of "+node.value+" : ");
    }
}
