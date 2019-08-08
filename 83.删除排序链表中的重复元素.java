/*
 * @lc app=leetcode.cn id=83 lang=java
 *
 * [83] 删除排序链表中的重复元素
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode original = head;
        while (head.next != null) {
            System.out.println(head.val);
            while (head.next != null && head.val == head.next.val) {
                if (head.next.next != null){
                    head.next = head.next.next;
                } else {
                    head.next = null;
                }
            }
            if (head.next != null){
                head = head.next;
            }
        }
        return original;
    }
}

