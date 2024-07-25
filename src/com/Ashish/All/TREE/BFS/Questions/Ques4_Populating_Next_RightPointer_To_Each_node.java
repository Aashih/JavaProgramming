package com.Ashish.All.TREE.BFS.Questions;

//https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/

//same as the simple BST algo
//the only diffrence is we have to point next of every node at each level
// to the right of that node  and (if there we are in the rightmost node then point it
//to null

//steps:
//1.do same as the also of BFS
//2. if BFS we check if currentNode.left != null then queue.offer(currentNode.left)
//             or if currentNode.right != null then queue.offer(currentNode.right)
//in this question just add one more check if(i == size- 1) , means we are in the rightmost node
//then make currentNode.next = null
//otherwise currentNode.next = queue.peek()

//BUT THIS SOLUTION TOOK O(N) S.C AND O(N) T.C (which is not good)
//We have to optimized it
//optimized code with explaination given in the leetcode go nd see

public class Ques4_Populating_Next_RightPointer_To_Each_node {
    public static void main(String[] args) {

    }
}
