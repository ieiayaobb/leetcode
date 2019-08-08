/*
 * @lc app=leetcode.cn id=27 lang=java
 *
 * [27] 移除元素
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        for(int i = 0; i < nums.length; i ++) {
            for (int j = nums.length - 1; j > i; j --) {
                if (nums[i] == val && nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] == val) {
                return i;
            }
        }
        return nums.length;
    }
}

