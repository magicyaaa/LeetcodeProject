package com.java.algorithm.solution;

import org.junit.Test;

import java.util.Stack;

/**
 * @program: LeetcodeProject
 * @description: 20. 有效的括号
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0020 {
    /**
     * 栈
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (method(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                if (stack.empty() || !equal(stack.pop(), s.charAt(i))) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean method(char c) {
        return c == '(' || c == '[' || c == '{';
    }

    private boolean equal(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        }
        if (c1 == '[' && c2 == ']') {
            return true;
        }
        if (c1 == '{' && c2 == '}') {
            return true;
        }
        return false;
    }

    @Test
    public void test(){
        String s = "()";
        Solution_0020 solution_0020 = new Solution_0020();
        System.out.println("System.out...... -> " +solution_0020.isValid(s));
    }
}
