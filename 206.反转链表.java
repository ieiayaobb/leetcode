/*
 * @lc app=leetcode.cn id=206 lang=java
 *
 * [206] 反转链表
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }
        ListNode prev = null;
        ListNode original = null;
        while(head.next != null) {
            System.out.println(head.val);
            original = head;

            head = head.next;
            original.next = prev;

            prev = original;
        }

        head.next = prev;
        System.out.println(head.val + "|" + prev.val);

        return head;
    }
}

