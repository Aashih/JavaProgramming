package com.Ashish.All.TREE.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
//https://leetcode.com/problems/binary-tree-level-order-traversal/description/

///For understanding visit copy
public class BinaryTreeLevelTraversalConcept {
    class Node{
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    private  Node root;

    private void Bst(){
        Bst(this.root);
    }
    public List<List<Integer>> Bst(Node node) {
        List<List<Integer>> result = new ArrayList<>();
        if (node == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int level = queue.size();
            List<Integer> currentL = new ArrayList<>();
            for (int i = 0; i < level; i++) {
                Node currentNode = queue.poll();
                currentL.add(currentNode.value);
                if (currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentL);
        }
        return result;
    }

    //type 2 : https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/
    //in this question we just have to print it in the reverse order
    //for this we have two option:
    //1.insert at the 0th index every time  ( like result(0,currentL))
    //2.reverse the whole list (Collection.reverse(result))
}
