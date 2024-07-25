package com.Ashish.All.TREE.SegmentTrees;

public class Segment {
    private class Node{
        int data;
        int startinterval;
        int endinterval;
        Node left;
        Node right;

        public Node(int startinterval,int endinterval){
            this.startinterval = startinterval;
            this.endinterval = endinterval;
        }
    }
    private Node root;
    public Segment(int[] arr){
        //create a tree using this array
        this.root = constructTree(arr,0,arr.length - 1);
    }
    private Node constructTree(int[] arr,int start,int end){
        if (start == end){
            //leaf node
            Node leaf = new Node(start,end);
            leaf.data = arr[start];
            return leaf;
        }

        //Create new node with index you are currently at
        Node node = new Node(start,end);
        int mid = (start+end)/2;

        //update the tree
        node.left = this.constructTree(arr,start,mid);
        node.right = this.constructTree(arr,mid+1,end);
        node.data = node.left.data + node.right.data;

        return node;

    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str ="";
        if (node.left != null){
            str = str + "Interval= ["+node.left.startinterval+" - "+node.left.endinterval+" ] and data: "+ node.left.data + " => ";
        }
        else{
            str = str+" No left child ! ";
        }
        //for current node
        str = str + "Interval = ["+node.startinterval+" - "+node.endinterval+"] and data :"+node.data+" <=";

        if (node.right!=null){
            str = str + "Interval= ["+node.right.startinterval+" - "+node.right.endinterval+" ] and data: "+ node.right.data ;
        }
        else{
            str = str + "No right child ";
        }
        System.out.println(str + "\n");

        //call recursion
        if (node.left!=null){
            display(node.left);
        }
        if (node.right!=null){
            display(node.right);
        }

    }

    //Query
    public int query(int qsi,int qei){
        return query(this.root,qsi,qei);
    }
    private int query(Node node,int qsi,int qei){
        //case 1 : Node interval lies inside the quary inteval
        if (node.startinterval >= qsi && node.endinterval <= qei) {
            //take all the item inside the items inside the node
            return node.data;
        } else if (node.startinterval > qei || node.endinterval < qsi) {  //case 2:
             return 0;
        }else{
            return this.query(node.left,qsi,qei) + this.query(node.right,qsi,qei); // case 3:
        }
    }

    //Update
    public void update(int index,int value){
        this.root.data = update(this.root,index,value);
    }
    public int update(Node node,int index,int value) {
        //check whether index lies inside the range or not
        if (index >= node.startinterval && index <= node.endinterval) {
            //if yes! then check
            if (index == node.startinterval && index == node.endinterval) {
                node.data = value;
                return node.data;
            } else {
                int leftAns = update(node.left, index, value);
                int rightAns = update(node.right, index, value);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }

    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        Segment tree = new Segment(arr);
        int sum = tree.query(1,6);
        System.out.println(sum);
        System.out.println(tree.query(1,6));
//        tree.update(2,10);
//        tree.display();
        tree.display();
    }

}
