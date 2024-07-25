package com.Ashish.All.TREE.DFS;
//https://leetcode.com/problems/serialize-and-deserialize-binary-tree/description/

//serialize - means converting a given tree into a string
//Deserialize - means converting tree into String

//make a final private variable String split = ','
//and N = "X";
//FOR SERIALIZE:
//Steps1: create a string builder(sb which store our final ans)
//2. if(node == null) then append N , split;
//otherwise do pre order traversal N-L-R

//FOR DESERIALIZE :
//steps 1. this is done by using queue initialize queue
//then add all the items in the queue which is store in string then call helper funtion
// inside the helper function
//2. remove the first string from the queue
//and check : if that string is 'X' if yes then point that node to null
//of pre order traversal to insert the element
public class Ques10_SerialAndDeserial {
}
