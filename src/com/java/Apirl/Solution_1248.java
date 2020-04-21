package com.java.Apirl;

/**
 * @program: LeetcodeProject
 * @description: 1248. 统计「优美子数组」
 * @author: Ya
 * @create: 2020-04-21 00:05
 **/
public class Solution_1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        int start, p, q, end, cur;
        start = 0;
        p = 0;
        while ((nums[p] & 1) != 1) {
            p++;
            if (p >= nums.length) {
                return 0;
            }
        }
        q = p;
        cur = 1;
        while (cur < k) {
            q++;
            if (q >= nums.length) {
                return 0;
            }
            if ((nums[q] & 1) == 1) {
                cur++;
            }
        }
        end = q;
        while (end + 1 < nums.length  && (nums[end + 1] & 1) != 1) {
            end++;
        }
        return numberOfSubarrays(nums, start, p, q, end);
    }

    private int numberOfSubarrays(int[] nums, int start, int p, int q, int end) {
        int res = (p - start + 1) * (end - q + 1);
        if (end == nums.length - 1) {
            return res;
        } else {
            start = p + 1;
            p++;
            while ((nums[p] & 1) != 1) {
                p++;
            }
            q = end + 1;
            end++;
            while (end + 1 < nums.length && (nums[end + 1] & 1) != 1) {
                end++;
            }
            return res + numberOfSubarrays(nums, start, p, q, end);
        }
    }

    public static void main(String[] args) {
        Solution_1248 s = new Solution_1248();
        int[] array = {2,1,1};
        int k = 2;
        int i = s.numberOfSubarrays(array, k);
        System.out.println("System.out...... -> " + i);
    }
}
