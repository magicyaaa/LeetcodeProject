package com.java.algorithm.solution;

import com.java.algorithm.common.ListNode;

/**
 * @program: LeetcodeProject
 * @description: 2. 两数相加
 * @author: Ya
 * @create: 2019-08-23 09:54
 **/
public class Solution_0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tag1 = l1, tag2 = l2, pre = l1;
        boolean sys = false;
        int temp;
        while (l1 != null && l2 != null) {
            temp = sys ? 1 : 0;
            sys = false;
            temp += l1.val + l2.val;
            if (temp >= 10) {
                temp -= 10;
                sys = true;
            }
            l1.val = temp;
            l2.val = temp;
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null && l2 == null) {
            if (sys) {
                pre.next = new ListNode(1);
            }
            return tag1;
        }

        ListNode head, tail;
        if (l1 == null) {
            head = tag2;
            tail = l2;
        } else {
            head = tag1;
            tail = l1;
        }
        while (tail != null) {
            temp = sys ? 1 : 0;
            sys = false;
            temp += tail.val;
            if (temp >= 10) {
                temp -= 10;
                sys = true;
            }
            tail.val = temp;
            pre = tail;
            tail = tail.next;
        }
        if (sys) {
            pre.next = new ListNode(1);
        }
        return head;
    }


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node12 = new ListNode(8);
        ListNode node2 = new ListNode(0);
        node1.next = node12;
        ListNode root = new Solution_0002().addTwoNumbers(node1, node2);
        while (root != null) {
            System.out.println("System.out...... -> " + root.val);
            root = root.next;
        }
    }
}
