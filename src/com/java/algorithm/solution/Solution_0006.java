package com.java.algorithm.solution;

import org.junit.Assert;
import org.junit.Test;


/**
 * @program: LeetcodeProject
 * @description: 6. Z 字形变换
 * @author: Ya
 * @create: 2019-08-27 22:46
 **/
public class Solution_0006 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        StringBuilder[] sbArray = new StringBuilder[numRows];
        for (int i = 0; i < sbArray.length; i++) {
            sbArray[i] = new StringBuilder();
        }
        int row;
        for (int i = 0; i < s.length(); i++) {
            row = i % (numRows + numRows - 2);
            if (row < numRows) {
                sbArray[row].append(s.charAt(i));
            } else {
                sbArray[numRows - (row - numRows) - 2].append(s.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder(s.length());
        for (StringBuilder sb : sbArray) {
            res.append(sb);
        }
        return res.toString();
    }

    @Test
    public void test() {
        Solution_0006 s = new Solution_0006();
        String ss = "LEETCODEISHIRING";
        Assert.assertEquals("LDREOEIIECIHNTSG", s.convert(ss, 4));
    }
}
