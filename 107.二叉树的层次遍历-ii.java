import java.util.ArrayList;
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
    List<List<Integer>> results = new ArrayList<>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return results;
        }
        List<TreeNode> rootLevel = new ArrayList<>();
        rootLevel.add(root);

        handle(rootLevel);

        return results;
    }

    private void handle(List<TreeNode> level) {
        List<Integer> valueLevel = new ArrayList<>();
        List<TreeNode> toHandle = new ArrayList<>();

        for (TreeNode node: level) {
            System.out.println(node.val);
            valueLevel.add(node.val);
            if (node.left != null) {
                toHandle.add(node.left);
            }

            if (node.right != null) {
                toHandle.add(node.right);
            }
        }

        results.add(0, valueLevel);

        if (toHandle.size() > 0) {
            handle(toHandle);
        }
    }
}

