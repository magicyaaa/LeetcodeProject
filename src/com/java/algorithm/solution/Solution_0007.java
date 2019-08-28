package com.java.algorithm.solution;


/**
 * @program: LeetcodeProject
 * @description: 7. 整数反转
 * @author: Ya
 * @create: 2019-08-28 11:33
 **/
public class Solution_0007 {
    public int reverse(int x) {
        boolean tag = x >= 0; //记录是否为正数
        long x1 = x;
        x1 = Math.abs(x1); //先取个绝对值
        String s1 = Long.toString(x1);
        StringBuilder sb = new StringBuilder(s1.length());
        for (int i = s1.length() - 1; i >= 0; i--) {
            sb.append(s1.charAt(i));
        }
        long num = Long.parseLong(sb.toString());
        num = tag ? num : 0 - num;
        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        } else {
            return (int) num;
        }
    }

    public static void main(String[] args) {
        Solution_0007 s = new Solution_0007();
        System.out.println("System.out...... -> " + s.reverse(-2147483648));
    }
}
