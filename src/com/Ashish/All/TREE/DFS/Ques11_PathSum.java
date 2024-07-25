package com.Ashish.All.TREE.DFS;

//https://leetcode.com/problems/path-sum/description/

//As we can see we have to go indepth in this question therefore we use dfs hare
// steps;
// very easy step

//NOTE : just sub the each node val to targetSum while calling recursively


//if(root == null) means we won't get our targetSum(0)
//check if(targetSum == root.val and left , right node is null then
//we got our answer JUST RETURN TRUE

//otherwise recursively call left and right of root node and
//subtract targetSum - root.val;

public class Ques11_PathSum {
}
