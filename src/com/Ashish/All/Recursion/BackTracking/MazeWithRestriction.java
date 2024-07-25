package com.Ashish.All.Recursion.BackTracking;

public class MazeWithRestriction {
    public static void main(String[] args) {
        boolean[][] mat = {
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };
        restric("",mat,0,0);
    }
    static void restric(String p ,boolean[][] matrix , int r ,int c){
        if (r==matrix.length-1 && c == matrix[0].length-1){
            System.out.println(p); 
            return;
        }
        if (!matrix[r][c]){
            return;
        }
        if (r < matrix.length-1){
            restric(p+"D",matrix,r+1,c);
        }
        if (c < matrix[0].length-1){
            restric(p+"R",matrix,r,c+1);
        }
    }
}
