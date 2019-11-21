package com.java.algorithm.solution;

import com.java.algorithm.common.ListNode;


/**
 * @program: LeetcodeProject
 * @description: 24. 两两交换链表中的节点
 * @author: Ya
 * @create: 2019-11-19 14:33
 **/
public class Solution_0024 {
    public ListNode swapPairs(ListNode head) {
        ListNode h = new ListNode(0);
        h.next = head;
        method(h);
        return h.next;
    }

    private void method(ListNode head) {
        if (head.next != null && head.next.next != null) {
            ListNode p = head.next;
            ListNode q = head.next.next;
            head.next = q;
            p.next = q.next;
            q.next = p;
            method(p);
        }
    }
}
