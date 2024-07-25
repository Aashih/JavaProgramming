package com.Ashish.All.TREE.BFS.Questions;

import java.util.LinkedList;
import java.util.Queue;


//Question :
//Given a binary tree and a node in the binary tree,
// find Levelorder successor of the given node.
// That is, the node that appears after the given node in the level order traversal
// of the tree.
//Consider the following binary tree
//           20
//        /     \
//        10     26
//        /  \   /   \
//        4  18 24    27
//        /  \
//        14 19
//        /   \
//        13  15
//
//        Levelorder traversal of given tree is:
//        20, 10, 26, 4, 18, 24, 27, 14, 19, 13, 15
//
//        Input : 24
//        Output : 27
//
//        Input : 4
//        Output : 18

// This question is also same as the algo of BFS
//Here we no need to check every value in level - so no for loop will be used
//and one more thing is to do is add the left and right value of node before comparing key
//with the current node becuase if we won't do this then our queue becomes empty!

public class Ques2_LevelOrderSuccessor {
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;
    public Node FindSuccessor(Node node,int key){
        if (node == null){
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
//            int levelS = queue.size();
//            for (int i = 0; i < levelS; i++) {
                Node currentN = queue.poll();
                if (currentN.left != null){
                    queue.offer(currentN.left);
                }
                if (currentN.right != null){
                    queue.offer(currentN.right);
                }
                if (currentN.value == key){
                   break;
                }
            }
        return queue.peek();
    }
}
