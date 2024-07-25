package com.Ashish.All.TREE.Traversal;

import java.util.Scanner;

public class ThreeTraversal {
    //Post order  = N - L - R
    private Node root;
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value); // inserting the value in root node which is asked by user
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of " + node.value + "?  (true or false) ");
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter right of  " + node.value + "? (true or false) ");
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of  " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){  //preorder = N - L - R
        if (node == null){
            return;
        }

        System.out.print(node.value + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node node){  // InOrder = L - N -R
        if (node == null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.value+" ");
        inOrder(node.right);
    }

    public void postOrder(){  // postorder = L-R-N
        postOrder(root);
    }
    private void postOrder(Node node){
        if (node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value+" ");
    }

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       ThreeTraversal po = new ThreeTraversal();
       po.populate(sc);
       System.out.println();
       System.out.println("PRE ORDER TRAVERSAL");
        po.preorder();

        System.out.println();
       System.out.println("INORDER TRAVERSAL");
        po.inOrder();

        System.out.println();
       System.out.println("POST ORDER TRAVERSAL");
       po.postOrder();

    }
}
