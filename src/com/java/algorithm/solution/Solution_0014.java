package com.java.algorithm.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 14. 最长公共前缀
 * @author: Ya
 * @create: 2019-09-24 13:40
 **/
public class Solution_0014 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int index = 0;
        char c;
        for (int col = 0; col < strs[0].length(); col++) {
            c = strs[0].charAt(col);
            for (int row = 0; row < strs.length; row++) {
                if (col < strs[row].length() && c == strs[row].charAt(col)) {
                    index = col;
                } else {
                    return strs[0].substring(0,index);
                }
            }
        }
        return strs[0];
    }

    @Test
    public void test(){
        Solution_0014 ss = new Solution_0014();
        Assert.assertEquals(ss.longestCommonPrefix(new String[]{"flower", "flow", "flight"}),"fl");
        Assert.assertEquals(ss.longestCommonPrefix(new String[]{"dog","racecar","car"}),"");

    }
}
