package com.java.algorithm.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetcodeProject
 * @description: 17. 电话号码的字母组合
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0017 {
    /**
     * BFS
     */
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() < 1) {
            return new ArrayList<String>();
        }
        String[] ss = new String[digits.length()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = get(digits.charAt(i));
        }
        List<String> resList = new ArrayList<>();
        method(resList, "", ss, 0);
        return resList;
    }

    private void method(List<String> resList, String s, String[] ss, int deep) {
        if (deep < ss.length) {
            for (int i = 0; i < ss[deep].length(); i++) {
                String s1 = s + ss[deep].charAt(i);
                method(resList, s1, ss, deep + 1);
            }
        } else {
            resList.add(s);
        }
    }

    private String get(char c) {
        switch (c) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }
}
