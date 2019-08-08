/*
 * @lc app=leetcode.cn id=26 lang=java
 *
 * [26] 删除排序数组中的重复项
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i = 0; i < nums.length - 1; i ++) {
            for (int j = i + 1; j < nums.length; j ++) {
                System.out.println(nums[i] + " = " + nums[j]);
                if (nums[i] == nums[j]) {
                    
                } else {
                    nums[index++] = nums[j];
                    i = j;
                }
            }
        }
        return index;
    }
}

