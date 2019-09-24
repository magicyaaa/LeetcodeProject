package com.java.algorithm.solution;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 13. 罗马数字转整数
 * @author: Ya
 * @create: 2019-09-24 10:53
 **/
public class Solution_0013 {
    /**
     * 字符          数值
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * <p>
     * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
     * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
     * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
     */
    public int romanToInt(String s) {
        int res = 0;
        int pre = 0;
        int now;
        for (int i = 0; i < s.length(); i++) {
            now = revers(s.charAt(i));
            if (now > pre) {
                res = res + now - pre - pre;
            } else {
                res += now;
            }
            pre = now;
        }
        return res;
    }

    private int revers(char c) {
        if (c == 'M') {
            return 1000;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'I') {
            return 1;
        } else {
            return 0;
        }
    }


    @Test
    public void test() {
        Solution_0013 ss = new Solution_0013();
        Assert.assertEquals(ss.romanToInt("III"), 3);
        Assert.assertEquals(ss.romanToInt("IV"), 4);
        Assert.assertEquals(ss.romanToInt("LVIII"), 58);
        Assert.assertEquals(ss.romanToInt("MCMXCIV"), 1994);

    }
}
