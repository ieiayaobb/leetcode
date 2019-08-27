/*
 * @lc app=leetcode.cn id=257 lang=java
 *
 * [257] 二叉树的所有路径
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
    public List<String> binaryTreePaths(TreeNode root) {
        
    }

    String trace = "";
    private void visit(TreeNode node) {
        trace += node.val;
        if (node.left == null && node.right == null) {

        } else {
            trace += "->";
        }
    }
}

