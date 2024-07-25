package com.Ashish.All.TREE.DFS;
//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/

//in this question we use dfs because we have to go indepth
//and we use pre-order traversal because
//we have to find the answer closer to the root

//steps
//1. if root == p || root == q { then no need to go down }
//just return from there
//2 . not then call root.left and root.right
//3. then if(left! = null && right!= null) return thr current node{current node will be the answer};
//4. otherwise{
//          if left == null then right will be the answer(return right)  else left will be the answer
public class Ques7_LCAofBST {
}
