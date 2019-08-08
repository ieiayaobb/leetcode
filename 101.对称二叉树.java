/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
        public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        List<TreeNode> tobe = new ArrayList<>();
        tobe.add(root);
        
        return handleLevel(tobe);
    }

    private boolean handleLevel(List<TreeNode> nodes) {
        List<TreeNode> tobe = new ArrayList<>();
        System.out.print("\n");
        for (int i = 0; i < nodes.size(); i++){
            TreeNode each = nodes.get(i);
            TreeNode another = nodes.get(nodes.size() - 1 - i);

            if (each.val != (another.val)) {
                return false;
            }

            System.out.print(each.val);
            if (each.val != -1111) {
                if (each.left != null) {
                    tobe.add(each.left);
                } else {
                    tobe.add(new TreeNode(-1111));
                }
                if (each.right != null) {
                    tobe.add(each.right);
                } else {
                    tobe.add(new TreeNode(-1111));
                }
            }
        }

        if (tobe.size() > 0) {
            return handleLevel(tobe);
        }
        return true;
    }
}

