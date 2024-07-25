package com.Ashish.All.TREE.BFS.Questions;

//https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/
//Approch:
//1. If normal order: then remove from front and add in the back [same as bfs algo]
//2. If reverse order : then remove from back and add in the front
//These can be achive by DEQUEUE(insertion and deletion can be done from both the end)
//we have to take a pointer which tells us when to reverse or not! (take boolean reverse (initailly false))

//and Remember while inserting the values in reverse order we have to insert right subtree first and the left subtree
public class Ques3_BTZigzagLevelOrderTraversal {

}
