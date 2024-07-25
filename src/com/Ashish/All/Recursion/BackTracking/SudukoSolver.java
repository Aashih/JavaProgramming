package com.Ashish.All.Recursion.BackTracking;

//https://leetcode.com/problems/sudoku-solver/description/
//STEPS:
//1. check for the empty slot
//nd put all the possible value if satisfies the the three condition,
//if statisfy then put it in the matrix;

public class SudukoSolver {
    public static boolean solveSudoku(char[][] board){
        for(int i = 0 ;i < 9 ; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') { //checking where there is empty slot or no}

                    for (char c = '1'; c <= '9'; c++) {
                        if (isvalid(board, i, j, c)) { // if the current number at index satisfies all the three rules
                            board[i][j] = c; //then put it to the matrix

                            if (solveSudoku(board))
                                return true;
                            else
                                //if number won't able to fill the empty solve acc. to the three rule
                                ///then make the index of matrix as it was before
                                board[i][j] = '.';
                        }
                    }
                    return false;//if you wont be able to fill the empty slot
                }
            }
        }
        return true; // if won't find any empty place just return from there
    }
    public static boolean isvalid(char[][] board , int row,int col,char c){
        //this will check the three conditions
        //1.the digit from 1-9 , once in a row
        //2. the digit from 1-9 , once in a col
        //3. the digit from 1-9 , once in every 3x3 matrix
        //if any of them is voilate then return false!!
        for (int i = 0; i < 9; i++) {
            //checking on each row (cond. 1)
            if (board[i][col] == c){
                return false;
            }
            //checkinng on each col(cond. 2)
            if (board[row][i] == c){
                return false;
            }
            //checking on each 3x3 matrix(cond. 3)
            if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        char[][] board= {
                {'9', '5', '7', '.', '1', '3', '.', '8', '4'},
                {'4', '8', '3', '.', '5', '7', '1', '.', '6'},
                {'.', '1', '2', '.', '4', '9', '5', '3', '7'},
                {'1', '7', '.', '3', '.', '4', '9', '.', '2'},
                {'5', '.', '4', '9', '7', '.', '3', '6', '.'},
                {'3', '.', '9', '5', '.', '8', '7', '.', '1'},
                {'8', '4', '5', '7', '9', '.', '6', '1', '3'},
                {'.', '9', '1', '.', '3', '6', '.', '7', '5'},
                {'7', '.', '6', '1', '8', '5', '4', '.', '9'}
        };
        solveSudoku(board);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
    }
}
