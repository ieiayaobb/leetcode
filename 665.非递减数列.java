/*
 * @lc app=leetcode.cn id=665 lang=java
 *
 * [665] 非递减数列
 *
 * https://leetcode-cn.com/problems/non-decreasing-array/description/
 *
 * algorithms
 * Easy (18.69%)
 * Total Accepted:    5K
 * Total Submissions: 25.6K
 * Testcase Example:  '[4,2,3]'
 *
 * 给定一个长度为 n 的整数数组，你的任务是判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * 
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (1 <= i < n)，满足 array[i] <= array[i + 1]。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [4,2,3]
 * 输出: True
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: [4,2,1]
 * 输出: False
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 * 
 * 
 * 说明:  n 的范围为 [1, 10,000]。
 * 
 */
class Solution {
    public boolean checkPossibility(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        boolean flag = false;
        // if (nums[0] < nums[1]) {
            // flag = true;
        // }
        for (int i = 0; i < nums.length - 1; i ++) {
            if (nums[i + 1] < nums[i]) {
                if (flag) {
                    return false;
                }
                flag = true;
                if (i > 0 && i < nums.length - 2) {
                    if (nums[i + 2] < nums[i + 1]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

