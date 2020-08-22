package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 58. 最后一个单词的长度
 * @author: Ya
 * @create: 2020-08-22 17:46
 **/
public class Solution_0058 {
    public int lengthOfLastWord(String s) {
        int len = 0;
        boolean is = false;
        for (int i = s.length()-1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                len++;
                is = true;
            } else {
                if (is) {
                    return len;
                }
            }
        }
        return len;
    }
}
