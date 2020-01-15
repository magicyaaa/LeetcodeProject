package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 36. 有效的数独
 * @author: Ya
 * @create: 2020-01-15 20:50
 **/
public class Solution_0036 {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] block = new boolean[9][9];
        char c;
        int num;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                c = board[i][j];
                if (c != '.') {
                    num = c - '1';
                    if (row[i][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                    }

                    if (col[j][num]) {
                        return false;
                    } else {
                        col[j][num] = true;
                    }

                    if (block[i / 3 * 3 + j / 3][num]) {
                        return false;
                    } else {
                        block[i / 3 * 3 + j / 3][num] = true;
                    }
                }
            }
        }
        return true;
    }
}
