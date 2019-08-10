/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 *
 * https://leetcode-cn.com/problems/factorial-trailing-zeroes/description/
 *
 * algorithms
 * Easy (37.03%)
 * Total Accepted:    8.8K
 * Total Submissions: 23.6K
 * Testcase Example:  '3'
 *
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * 
 * 示例 1:
 * 
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 
 * 示例 2:
 * 
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 * 
 */
class Solution {
    public int trailingZeroes(int n) {
        int ex = (int)(Math.log((double)n) / Math.log((double)5));

        int total = 0;
        
        for (int i = ex; i > 0; i--) {
            if (n >= Math.pow(5, i)) {
                total += (int)(n / Math.pow(5, i));
            }
        }


        return total;
    }
}

