import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=724 lang=java
 *
 * [724] 寻找数组的中心索引
 */
class Solution {
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; ){
            for (int j = nums.length - 1; j >= 0; ){
                System.out.println(leftSum + " : " + rightSum);
                System.out.println(i + " = " + j);
                if (leftSum < rightSum) {
                    leftSum += nums[i++];
                } else if (leftSum > rightSum) {
                    rightSum += nums[j--];
                } else {
                    if (i >= j) {
                        return i;
                    } else {
                        leftSum += nums[i++];
                    }
                }
            }
        }
        return -1;
    }
}

