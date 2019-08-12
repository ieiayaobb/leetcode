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
    private List<Integer> heights = new ArrayList<>();
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }

        if (root.left == null || root.right == null) {
            return true;
        }
        check(root, 0);

        for (int i = 1 ; i < heights.size(); i ++) {
            if (heights.get(i - 1) - heights.get(i) > 1 || heights.get(i - 1) - heights.get(i) < -1) {
                return false;
            }
        }

        return true;
    }

    private void check(TreeNode node, int height) {
        height++;
        //System.out.println(node.val + " : " + height);
        
        if (node.left != null) {
            check(node.left, height);
        }
        if (node.right != null) {
            check(node.right, height);
        }
        if (node.left == null || node.right == null) {
            heights.add(height);
            System.out.println(height);
        }
    }
}

