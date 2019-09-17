package com.java.algorithm.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 10. 正则表达式匹配
 * @author: Ya
 * @create: 2019-09-12 16:36
 **/
public class Solution_0010 {
    public boolean isMatch(String s, String p) {
        return isMatch(s, 0, p, 0);
    }

    private boolean isMatch(String s, int index_s, String p, int index_p) {
        if (index_s >= s.length() && index_p >= p.length()) { //字符串和模式串都匹配完
            return true;
        }
        if (index_s >= s.length()) { //字符串匹配完，模式串还没完
            if (isRepete(p, index_p)) {
                return isMatch(s, index_s, p, index_p + 2);
            } else {
                return false;
            }
        }
        if (index_p >= p.length()) { //模式串匹配完，字符串没匹配完
            return false;
        }
        // 以下是 都未匹配完
        if (isRepete(p, index_p)) {
            while (!isMatch(s, index_s, p, index_p + 2)) {
                if (index_s >= s.length()) {
                    return false;
                }
                if (charIsMatch(s.charAt(index_s), p.charAt(index_p))) {
                    index_s++;
                } else {
                    return false;
                }
            }
            return true;
        } else {
            if (charIsMatch(s.charAt(index_s), p.charAt(index_p))) {
                return isMatch(s, index_s + 1, p, index_p + 1);
            } else {
                return false;
            }
        }
    }

    /**
     * 判断当前字符是否*重复
     */
    private boolean isRepete(String p, int i) {
        if (i + 1 < p.length() && p.charAt(i + 1) == '*') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 字符是否匹配
     */
    private boolean charIsMatch(char c, char p) {
        if (p == '.') {
            return true;
        } else {
            return c == p;
        }
    }

    public static void main(String[] args) {
        String s = "ab";
        String p = ".*c";
        Solution_0010 ss = new Solution_0010();
        System.out.println("System.out...... -> " + ss.isMatch(s, p));
    }

    @Test
    public void test() {
        Solution_0010 ss = new Solution_0010();
        Assert.assertEquals(ss.isMatch("aa", "a"), false);
        Assert.assertEquals(ss.isMatch("aa", "a*"), true);
        Assert.assertEquals(ss.isMatch("ab", ".*"), true);
        Assert.assertEquals(ss.isMatch("aab", "c*a*b"), true);
        Assert.assertEquals(ss.isMatch("mississippi", "mis*is*p*."), false);
        Assert.assertEquals(ss.isMatch("aaa", "a*a"), true);
        Assert.assertEquals(ss.isMatch("ab", ".*c"), false);

    }
}
