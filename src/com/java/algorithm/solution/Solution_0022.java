package com.java.algorithm.solution;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetcodeProject
 * @description: 22. 括号生成
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0022 {
    public List<String> generateParenthesis(int n) {
        List<String> resList = new ArrayList<>();
        method("", n, 0, resList);
        return resList;
    }

    private void method(String s, int k, int leftNum, List<String> list) {
        if (k == 0) {
            list.add(addRight(leftNum, s));
        } else {
            String temp;
            for (int i = 0; i <= leftNum; i++) {
                method(addRight(i, s) + '(', k - 1, leftNum - i + 1, list);
            }
        }
    }

    private String addRight(int num, String s) {
        for (int i = 0; i < num; i++) {
            s += ')';
        }
        return s;
    }

    @Test
    public void test() {
        Solution_0022 s = new Solution_0022();
        List<String> list = s.generateParenthesis(4);
        for (String ss : list) {
            System.out.println("System.out...... -> " + ss);
        }
    }
}
