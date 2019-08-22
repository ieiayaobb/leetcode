import java.util.List;

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

        check(root);

        return flag;
    }

    private Boolean flag = true;

    private int check(TreeNode node) {
        int leftH = 1;
        int rightH = 1;
        if (node.left != null) {
            leftH = check(node.left);
        }
        if (node.right != null) {
            rightH = check(node.right);
        }

        System.out.println("leftH: " + leftH + ", rightH:" + rightH);

        if (Math.abs(leftH - rightH) > 1) {
            flag = false;
        }

        return Math.max(leftH, rightH) + 1;
    }
}

