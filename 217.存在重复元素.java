/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 *
 * https://leetcode-cn.com/problems/contains-duplicate/description/
 *
 * algorithms
 * Easy (46.72%)
 * Total Accepted:    43.2K
 * Total Submissions: 92.4K
 * Testcase Example:  '[1,2,3,1]'
 *
 * 给定一个整数数组，判断是否存在重复元素。
 * 
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,1]
 * 输出: true
 * 
 * 示例 2:
 * 
 * 输入: [1,2,3,4]
 * 输出: false
 * 
 * 示例 3:
 * 
 * 输入: [1,1,1,3,3,4,3,2,4,2]
 * 输出: true
 * 
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        long value = 1l;
        int oneCount = 0;
        int zeroCount = 0;
        for (long num : nums) {
            if (num == 0) {
                zeroCount ++;
            } else if (num == 1) {
                oneCount ++;
            } else if (value % num != 0) {
                value *= (long)num;
            } else if(oneCount < 1) {
                return true;
            }

            if (oneCount > 1 || zeroCount > 1) {
                return true;
            }
        }
        return false;
    }
}

