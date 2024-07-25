package com.Ashish.All.Recursion.BackTracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/n-queens/description/


//This is very popular problem for the explaination of question visit copy

//TC = O(3N)  You can optimize this by using hashmap

//This question is solved in two steps
//1. make the validate funtion where check the three rule (left,upward left daigonally , downward left diagonally)
//2. insert Q in the board and backtrack make construct funtion tol insert every steps

public class N_Queen {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> queen = solveNqueen(n);
        int i = 1 ;
        for (List<String> it : queen){
            System.out.println("Way: "+ i);
            for(String s : it){
                System.out.println(s);
            }
            System.out.println();
            i+=1;
        }
    }
    public static List<List<String>> solveNqueen(int n) {
        char[][] board = new char[n][n]; //this is used to store our answer at everu recursive call
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';//initailly all will be empty(.)
            }
        }
        List<List<String>> ans = new ArrayList<>();
        solve(0, board, ans);
        return ans;
    }

    //checkin the three condition
    static boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        //Now check the three rule
        while (row >= 0 && col >= 0) {
            //this is to check any Q in left side upward diagonally
            if (board[row][col] == 'Q') {
                return false;
            }
            row--;
            col--;
        }
        //put the origial value of row nd col because it may chnage
        col = dupcol;
        row = duprow;
        while (col >= 0) {
            //checking on left hand side of board
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
        }
        //this is because original values of row and col may chnage
        row = duprow;
        col = dupcol;
        while (row < board.length && col >= 0) {
            //checking left side downward daigonally
            if (board[row][col] == 'Q') {
                return false;
            }
            col--;
            row++;
        }
        return true;
    }

    static void solve(int col, char[][] board, List<List<String>> ans) {
        if (col == board.length) {
            //means we got our first way
            ans.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) { // check all the three rule
                board[row][col] = 'Q'; // add to the row of current col
                solve(col + 1, board, ans); // increase col by 1
                board[row][col] = '.'; //backtrack
            }
        }
    }

    static List<String> construct(char[][] board){
        //this fuction will add every row  in the answer list
        List<String> res = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]); //storing every string
            res.add(s);
        }
        return res;
    }
}
