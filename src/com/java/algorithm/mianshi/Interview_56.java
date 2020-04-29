package com.java.algorithm.mianshi;

/**
 * @program: LeetcodeProject
 * @description: 面试题56 - I. 数组中数字出现的次数
 * @author: Ya
 * @create: 2020-04-28 00:50
 **/
public class Interview_56 {
    //[1,2,5,2]
    public  int[] singleNumbers(int[] nums) {
        int index = 0;
        int temp = 0;
        int[] res = new int[2];
        for (int num : nums) {
            temp ^= num;
        }
        while ((temp & 1) == 0) {
            temp >>= 1;
            index++;
        }
        for (int num : nums) {
            int t = num >> index;
            if ((t & 1) == 1) {
                res[0] ^= num;
            } else {
                res[1] ^= num;
            }
        }
        return res;
    }


}
