/*
 * @lc app=leetcode.cn id=112 lang=java
 *
 * [112] 路径总和
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
    List<Integer> results = new ArrayList();

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.val == sum && root.left == null && root.right == null) {
            return true;
        }

        if (root.val == sum) {
            return false;
        }

        visit(root, 0);

        for (int result: results) {
            System.out.println(result);
            if (result == sum) {
                return true;
            }
        }

        return false;
    }

    private void visit(TreeNode node, int val) {
        System.out.println(node.val + " = " + val);
        int result = val + node.val;
        // System.out.println(result);
        if (node.left != null) {
            visit(node.left, result);
        }
        if (node.right != null) {
            visit(node.right, result);
        }
        if (node.left == null && node.right == null) {
            results.add(result);
        }
    }
}

