/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子序和
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i ++) {
            int sum = 0;

            for (int j = i; j < nums.length; j ++) {
                sum += nums[j];

                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}

