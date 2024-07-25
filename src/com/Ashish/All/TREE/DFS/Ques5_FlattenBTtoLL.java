package com.Ashish.All.TREE.DFS;

//https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/

//Brute force :
//1.do normal pre order traversal
//2.As you traverse store the node in a queue
//3. At the end , remove from queue and make LinkedList
//Space and Time C for this is O(n)

//Optimized Approch :
//1. check the current node if it has the left chid , if yes
//then find the rightmost element for it
// then do rightmost element = currentNode.right

//after that convert the left child into right child

//JUST FOLLOW THE DIAGRAM
//sc = o(1)
public class Ques5_FlattenBTtoLL {

}
