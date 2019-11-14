package com.java.algorithm.solution;

import com.java.algorithm.common.ListNode;
import org.junit.Test;


/**
 * @program: LeetcodeProject
 * @description: 21. 合并两个有序链表
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0021 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode next = head;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                next.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                next.next = l1;
                l1 = l1.next;
            } else if (l1.val <= l2.val) {
                next.next = l1;
                l1 = l1.next;
            } else {
                next.next = l2;
                l2 = l2.next;
            }
            next = next.next;
        }
        return head.next;
    }
}
