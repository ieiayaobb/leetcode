/*
 * @lc app=leetcode.cn id=507 lang=java
 *
 * [507] 完美数
 *
 * https://leetcode-cn.com/problems/perfect-number/description/
 *
 * algorithms
 * Easy (33.42%)
 * Total Accepted:    3.8K
 * Total Submissions: 11.2K
 * Testcase Example:  '28'
 *
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 * 
 * 
 * 
 * 示例：
 * 
 * 
 * 输入: 28
 * 输出: True
 * 解释: 28 = 1 + 2 + 4 + 7 + 14
 * 
 * 
 * 
 * 
 * 注意:
 * 
 * 输入的数字 n 不会超过 100,000,000. (1e8)
 * 
 */
class Solution {
    public boolean checkPerfectNumber(int num) {
        int result = 0;
        for (int i = 1; i <= num / 2; i ++) {
            if (num % i == 0) {
                result += i;
                if (result > num) {
                    return false;
                }
            }
        }
        return num == result;
    }
}

