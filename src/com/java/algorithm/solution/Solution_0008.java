package com.java.algorithm.solution;

/**
 * @program: LeetcodeProject
 * @description: 8. 字符串转换整数 (atoi)
 * @author: Ya
 * @create: 2019-08-30 13:39
 **/
public class Solution_0008 {
    public static void main(String[] args) {
        Solution_0008 s = new Solution_0008();
        String ss = "000000000000000000000000";
        System.out.println("System.out...... -> " + s.myAtoi(ss));
    }

    public int myAtoi(String str) {
        final String MAX_INT = Integer.toString(Integer.MAX_VALUE);
        //final String MIN_INT = Integer.toString(Integer.MIN_VALUE);

        //去空格
        str = str.trim();
        if (str.length() == 0) return 0;
        //取符号
        boolean sign;
        int start = 0;
        if (Character.isDigit(str.charAt(0))) {
            sign = true;
            start = 0;
        } else if (str.charAt(0) == '-') {
            sign = false;
            start = 1;
        } else if (str.charAt(0) == '+') {
            sign = true;
            start = 1;
        } else {
            return 0;
        }

        StringBuilder sb = new StringBuilder();
        //去除前导0
        for (; start < str.length(); start++) {
            if (str.charAt(start) != '0') {
                break;
            }
        }
        for (int i = start; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                sb.append(str.charAt(i));
            } else {
                break;
            }
        }
        if (sb.length() == 0) return 0;
        if (sb.length() > MAX_INT.length()) {
            if (sign) {
                return Integer.MAX_VALUE;
            } else {
                return Integer.MIN_VALUE;
            }
        }

        long l = Long.parseLong(sb.toString());
        if (!sign) {
            l = -l;
        }
        if (l > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (l < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int) l;
        }
    }
}
