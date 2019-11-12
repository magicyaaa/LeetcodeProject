package com.java.algorithm.solution;

import com.java.algorithm.common.ListNode;

import java.util.List;

/**
 * @program: LeetcodeProject
 * @description: 19. 删除链表的倒数第N个节点
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0019 {
    /**
     * 双指针
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode last;
        for (int i = 0; i <= n; i++) {
            if (i == n) {
                last = head;
                if (fast == null) {
                    return head.next;
                }
                while (fast.next != null) {
                    fast = fast.next;
                    last = last.next;
                }
                //删除下一个节点
                last.next = last.next.next;
                return head;
            }
            fast = fast.next;
        }
        return head;
    }
}
