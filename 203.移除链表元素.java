/*
 * @lc app=leetcode.cn id=203 lang=java
 *
 * [203] 移除链表元素
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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        while (head.val == val) {
            if (head.next != null) {
                head = head.next;
            } else {
                return null;
            }
        }

        ListNode original = head;
        ListNode prev = head;
		while (head != null) {
			while (head.val == val) {
				if (head.next != null) {
					head.val = head.next.val;
					head.next = head.next.next;
				} else {
                    prev.next = null;
                    break;
				}
			}

			if (head != null) {
				System.out.println(head.val);
				prev = head;
				head = head.next;
			}
		}
        return original;
    }
}

