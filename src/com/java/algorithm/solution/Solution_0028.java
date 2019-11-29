package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 28. 实现 strStr()
 * @author: Ya
 * @create: 2019-11-24 16:12
 **/
public class Solution_0028 {
    public int strStr(String haystack, String needle) {
        if (needle == null || "".equals(needle)) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0) && match(haystack, needle, i)) {
                return i;
            }
        }
        return -1;
    }

    private boolean match(String haystack, String needle, int start) {
        for (int i = 0; i < needle.length(); i++) {
            if (i + start >= haystack.length() || needle.charAt(i) != haystack.charAt(i + start)) {
                return false;
            }
        }
        return true;
    }
}
