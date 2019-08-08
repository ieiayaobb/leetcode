/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            minHeight = 1;
        }
        check(root, 0);

        System.out.println("max: " + maxHeight);
        System.out.println("min: " + minHeight);
        return maxHeight - minHeight <= 1;
    }

    private int maxHeight = 0;
    private int minHeight = Integer.MAX_VALUE;

    private void check(TreeNode node, int height) {
        height++;
        System.out.println(node.val + " : " + height);
        
        if (node.left != null) {
            check(node.left, height);
        }
        if (node.right != null) {
            check(node.right, height);
        }
        if (node.left == null || node.right == null) {
            System.out.println(height + " < " + minHeight);
            if (height < minHeight) {
                minHeight = height;
            }

            if (height > maxHeight) {
                maxHeight = height;
            }
        }
    }
}

