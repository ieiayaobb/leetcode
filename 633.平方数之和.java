/*
 * @lc app=leetcode.cn id=633 lang=java
 *
 * [633] 平方数之和
 *
 * https://leetcode-cn.com/problems/sum-of-square-numbers/description/
 *
 * algorithms
 * Easy (29.59%)
 * Total Accepted:    4.2K
 * Total Submissions: 14.1K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a^2 + b^2 = c。
 * 
 * 示例1:
 * 
 * 
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 * 
 * 
 * 
 * 
 * 示例2:
 * 
 * 
 * 输入: 3
 * 输出: False
 * 
 * 
 */
class Solution {
    public boolean judgeSquareSum(int c) {
        int limit = (int)Math.sqrt(c);
        for (int i = 0; i <= limit; i++) {
            for (int j = i; j <= limit; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == c) {
                    return true;
                }
            }
        }

        return false;
    }
}

