import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    List<Integer> ids = new ArrayList<>();
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        iter(l1, l2);

        ListNode root = null;
        if (ids.size() > 0) {
            root = new ListNode(ids.get(0));
            ListNode other = root;
            for (int i = 1; i < ids.size(); i++) {
                ListNode temp = new ListNode(ids.get(i));
                other.next = temp;
                other = temp;
            }
        }
        return root;
    }

    private ListNode iter(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            System.out.println(l2.val);
            while(l2 != null) {
                ids.add(l2.val);
                l2 = l2.next;
            }
            return l2;
        } else if (l2 == null) {
            System.out.println(l1.val);
            while(l1 != null) {
                ids.add(l1.val);
                l1 = l1.next;
            }
            return l1;
        } else {
            System.out.println(l1.val + " = " + l2.val);
            int result = judge(l1, l2);
            if (result > 0) {
                ids.add(l1.val);
                System.out.println(l1.val);
                return iter(l1.next, l2);
            } else {
                ids.add(l2.val);
                System.out.println(l2.val);
                return iter(l1, l2.next);
            }
            
        }
    }

    private int judge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return 0;
        } else if (l1 == null) {
            return -1;
        } else if (l2 == null) {
            return 1;
        } else {
            System.out.println(l1.val + " = " + l2.val);

            if (l1.val < l2.val) {
                return 1;
            } else if (l1.val > l2.val) {
                return -1;
            } else {
                return judge(l1.next, l2.next);
            }
        }
    }
}

