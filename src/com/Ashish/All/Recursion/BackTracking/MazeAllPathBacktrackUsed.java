package com.Ashish.All.Recursion.BackTracking;

import java.util.ArrayList;

public class MazeAllPathBacktrackUsed {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        path1("",board,0,0);
        ArrayList<String> ans = path("", board, 0, 0);
        System.out.println(ans);
    }

        static void path1(String p ,boolean[][] mat, int r , int c) {
        if (r == mat.length - 1 && c == mat[0].length - 1) {
            System.out.println(p);
            return;
        }
        if (!mat[r][c]) {
            return;
        }
        mat[r][c] = false; // Marking false to the cell that are visited for this path
        if (r < mat.length - 1) {
            path1(p + "D", mat, r + 1, c);
        }
        if (c < mat[0].length - 1) {
            path1(p + "R", mat, r, c + 1);
        }
        if (r > 0) {
            path1(p + "U", mat, r - 1, c);
        }
        if (c > 0) {
            path1(p + "L", mat, r, c - 1);
        }
        mat[r][c] = true; // marking true while going back from recursive call
}
//    using array list:
    static ArrayList<String> path(String p, boolean[][] mat, int r, int c) {
        if (r == mat.length - 1 && c == mat[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!mat[r][c]) {
            return list;
        }
        mat[r][c] = false;
        if (r < mat.length - 1) {
            list.addAll(path(p + "D", mat, r + 1, c));
        }
        if (c < mat[0].length - 1) {
            list.addAll(path(p + "R", mat, r, c + 1));
        }
        if (r > 0) {
            list.addAll(path(p + "U", mat, r - 1, c));
        }
        if (c > 0) {
            list.addAll(path(p + "L", mat, r, c - 1));
        }
        mat[r][c] = true;
        return list;
    }
}
