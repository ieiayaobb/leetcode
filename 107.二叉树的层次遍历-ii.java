/*
 * @lc app=leetcode.cn id=107 lang=java
 *
 * [107] 二叉树的层次遍历 II
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
    private List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
    }

    private void handle(TreeNode node) {
        List<Integer> level = new ArrayList<>();
        if (node.left != null) {
            handle(node.left);
        }

        if (node.right != null) {
            handle(node.right);
        }
    }
}

