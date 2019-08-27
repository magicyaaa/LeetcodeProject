package com.java.algorithm.solution;

import org.junit.Test;
import org.junit.Assert;

/**
 * @program: LeetcodeProject
 * @description: 5. 最长回文子串
 * @author: Ya
 * @create: 2019-08-26 19:45
 **/
public class Solution_0005 {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        int index = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j) && i - j > max) {
                    if (isReverseString(s, j, i)) {
                        max = i - j;
                        index = j;
                    }
                }
            }
        }
        return s.substring(index, index + max + 1);
    }

    private boolean isReverseString(String s, int head, int tail) {
        while (head <= tail) {
            if (s.charAt(head) != s.charAt(tail)) {
                return false;
            }
            head++;
            tail--;
        }
        return true;
    }

    @Test
    public void test() {
        Solution_0005 s = new Solution_0005();
        Assert.assertEquals("bab", s.longestPalindrome("babad"));
    }
}
