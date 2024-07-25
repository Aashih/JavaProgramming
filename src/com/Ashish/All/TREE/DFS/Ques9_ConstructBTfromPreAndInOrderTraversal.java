package com.Ashish.All.TREE.DFS;

//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/

//in this question we don't have to think we just have to whatever
//is given to us

//Approch :
//1. just find left and right subtree
//2.With the help of perorder array we find the root node
// (fist element will be the root node)
//3.then in inorder array try to find the root node that we get from
//post order (loop from 0 to inorder.length)
//once we got the root in inorder array then the
//left side of the array is the left child and right side will be the right child
//then make a node put the root node in it(node = new node(r))

//after that recursively call left and right node
//node.left = copyof(preorder,1,index+1),copyof(inorder,0,index)
//node.right = copyof(preorder,index+1,preorder,length),copy(inorder,index+1,inorder.length)

//At the end just return the node


//You can optimize this problem BY HASHING

public class Ques9_ConstructBTfromPreAndInOrderTraversal {
}
