/*
 * @lc app=leetcode.cn id=704 lang=java
 *
 * [704] Binary Search
 */
class Solution {
    private int[] nums;

    private int target;
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        this.nums = nums;
        this.target = target;
        return reverse(0, nums.length - 1);
    }

    private int reverse(long left, long right) {
        if (right - left == 1) {
            if (nums[(int)left] == target) {
                return (int)left;
            } else if (nums[(int)right] == target) {
                return (int)right;
            } else {
                return -1;
            }
        }

        System.out.println(left + " = " + right);
        long middle = (left + right) / 2;
        // System.out.println(middle);
        if (target > nums[(int)middle]) {
            return reverse(middle, right);
        } else if (target < nums[(int)middle]) {
            return reverse(left, middle);
        }
        
        return (int)middle;
    }
}

