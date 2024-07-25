package com.Ashish.All.StackNQueue.Questions;

//https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "({[]})";
        System.out.println(isvalid(s));
    }

    static boolean isvalid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);  // push all the openning bracket to the stack
            } else {
                //if there is any closing bracket found then check 2 things:
                //1. check wherther stack is empty or not
                //2.pop char from stack and check whether that popped char is equal to the opening bracket of same type of char or not
                //if yes - then pop it
                // if no - the return false
                if (ch == ')') {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        return false;
                    }
                }
                if (ch == '}') {
                    if (stack.isEmpty() || stack.pop() != '{') {
                        return false;
                    }
                }
            }
        }
        // at the end out stack become empty if all the bracket succefully popped
        return stack.isEmpty();  //if stack empty then -> true otherwise -> false;
    }

//    2nd type of valid parenthesis question
    //https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
static int minAddToMakeValid(String s) {
    Stack<Character> stack = new Stack<>();
    for(char ch : s.toCharArray()){
        if(ch == ')'){
            if(!stack.isEmpty() && stack.peek() == '('){
                //if stack is not emty nd its first char is '(' the pop it
                //because we get the valid parenthesis
                stack.pop();
            }
            else{
                //if not the push it to the stack
                stack.push(ch);
            }
        }
        else{
            //otherwise if ch = '(' then push it in the stack
            stack.push(ch);
        }
    }
    return stack.size();
}
}