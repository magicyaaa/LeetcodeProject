package com.java.algorithm.solution;


import org.junit.Assert;
import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 12. 整数转罗马数字
 * @author: Ya
 * @create: 2019-09-23 17:22
 **/
public class Solution_0012 {
    /**
     * 字符          数值
     * I             1.
     * V             5
     * X             10.
     * L             50
     * C             100.
     * D             500
     * M             1000
     */
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int m = num / 1000;
        insert(sb, m, "M");

        num %= 1000;
        int c = num / 100;
        if (c == 9) {
            insert(sb, 1, "CM");
        } else if (c == 4) {
            insert(sb, 1, "CD");
        } else if (c >= 5) {
            insert(sb, 1, "D");
            c -= 5;
            insert(sb, c, "C");
        } else {
            insert(sb, c, "C");
        }

        num %= 100;
        int x = num / 10;
        if (x == 9) {
            insert(sb, 1, "XC");
        } else if (x == 4) {
            insert(sb, 1, "XL");
        } else if (x >= 5) {
            insert(sb, 1, "L");
            x -= 5;
            insert(sb, x, "X");
        } else {
            insert(sb, x, "X");
        }

        num %= 10;
        int i = num;
        if (i == 9) {
            insert(sb, 1, "IX");
        } else if (i == 4) {
            insert(sb, 1, "IV");
        } else if (i >= 5) {
            insert(sb, 1, "V");
            i -= 5;
            insert(sb, i, "I");
        } else {
            insert(sb, i, "I");
        }
        return sb.toString();
    }

    private void insert(StringBuilder sb, int num, String s) {
        for (int i = 0; i < num; i++) {
            sb.append(s);
        }
    }

    @Test
    public void test() {
        Solution_0012 ss = new Solution_0012();
        Assert.assertEquals(ss.intToRoman(3), "III");
        Assert.assertEquals(ss.intToRoman(4), "IV");
        Assert.assertEquals(ss.intToRoman(1994), "MCMXCIV");
    }

}
