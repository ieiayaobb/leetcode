import java.util.ArrayList;

/*
 * @lc app=leetcode.cn id=111 lang=java
 *
 * [111] 二叉树的最小深度
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private int maxHeight = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        check(root, 0);
        return maxHeight;
    }

    private void check(TreeNode node, int height) {
        height++;
        System.out.println(node.val + " : " + height);
        
        if (node.left != null) {
            check(node.left, height);
        }
        if (node.right != null) {
            check(node.right, height);
        }
        if (node.left == null && node.right == null) {
            if (height < maxHeight) {
                maxHeight = height;
            }
        }
    }
}

