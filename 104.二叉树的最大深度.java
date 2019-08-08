import java.util.LinkedList;
import java.util.Stack;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    int max = 0;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        visit(root, 0);

        return max;
    }

    private void visit(TreeNode node, int height) {
        System.out.println(node.val + " = " + height + " : " + max);
        height++;
        if (height > max) {
            max = height;
        }
        if (node.left != null) {
            visit(node.left, height);
        }
        if (node.right != null) {
            visit(node.right, height);
        }
    }
}

