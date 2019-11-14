package com.java.algorithm.solution;

import com.java.algorithm.common.ListNode;
import org.junit.Test;


/**
 * @program: LeetcodeProject
 * @description: 23. 合并K个排序链表
 * @author: Ya
 * @create: 2019-11-06 19:23
 **/
public class Solution_0021 {
    /**
     * 对每个链表头查最小值
     * 可以用对排序 或优先队列
     * https://leetcode-cn.com/problems/merge-k-sorted-lists/
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = method(lists);
        if (head == null) {
            return null;
        }
        ListNode oriHead = head;
        ListNode next;
        while (true) {
            next = method(lists);
            head.next = next;
            if (next == null) {
                return oriHead;
            }
            head = head.next;
        }
    }

    /**
     * 判断所有链表头 取最小节点  返回
     *
     * @param lists
     * @return
     */
    private ListNode method(ListNode[] lists) {
        if (lists == null || lists.length < 1) {
            return null;
        }
        int min = Integer.MAX_VALUE;
        int indexNode = -1;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                if (lists[i].val < min) {
                    indexNode = i;
                    min = lists[i].val;
                }
            }
        }
        if (indexNode == -1) {
            return null;
        }
        ListNode resNode = lists[indexNode];
        lists[indexNode] = lists[indexNode].next;
        return resNode;
    }

    @Test
    public void test() {
        Solution_0021 s = new Solution_0021();
        ListNode[] lists = new ListNode[1];
        System.out.println("System.out...... -> " + s.mergeKLists(lists));
    }
}
