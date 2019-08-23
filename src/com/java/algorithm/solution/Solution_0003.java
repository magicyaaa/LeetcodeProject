package com.java.algorithm.solution;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @program: LeetcodeProject
 * @description: 3. 无重复字符的最长子串
 * @author: Ya
 * @create: 2019-08-23 13:11
 **/
public class Solution_0003 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>(2 << 5);
        int max = 0;
        int start = -1, end = 0;
        char key;
        while (end < s.length()) {
            key = s.charAt(end);
            if (map.containsKey(key)) {
                int temp = start + 1;
                start = map.get(key);
                while (temp <= start) {
                    map.remove(s.charAt(temp));
                    temp++;
                }
                map.put(key, end);
            } else {
                map.put(key, end);
                if (map.size() > max) {
                    max = map.size();
                }
            }
            end++;
        }
        return max;
    }

    public static void main(String[] args) {
       // String s = "tmmzuxt";
        //String s = "abcabcbb";
        String s = "bbbbb";
        System.out.println("System.out...... -> " + new Solution_0003().lengthOfLongestSubstring(s));
    }
}
