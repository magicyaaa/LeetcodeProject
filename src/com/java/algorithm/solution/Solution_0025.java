package com.java.algorithm.solution;


import com.java.algorithm.common.ListNode;


/**
 * @program: LeetcodeProject
 * @description: 25. K 个一组翻转链表
 * @author: Ya
 * @create: 2019-11-24 16:12
 **/
public class Solution_0025 {
    /**
     * 要求常数空间，不好使用递归
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k == 1) {
            return head;
        }
        if (head == null) {
            return head;
        }
        int step;
        ListNode p, q, r;
        p = head;
        q = head;
        r = head.next;
        step = k;
        while (step > 1) {
            if (r == null) {//长度不够反转了
                while (q != head) {
                    q.next = r;
                    r = q;
                    q = p;
                    p = p.next;
                }
                return head;
            }
            p = q;
            q = r;
            r = q.next;
            q.next = p;
            step--;
        }
        head.next = reverseKGroup(r, k);
        return q;
    }

    public static void main(String[] args) {
        Solution_0025 s = new Solution_0025();
        ListNode list = ListNode.createNodeList(new int[]{1, 2, 3, 4, 5});
        ListNode node = s.reverseKGroup(list, 4);

    }
}

