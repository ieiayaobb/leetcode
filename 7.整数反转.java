/*
 * @lc app=leetcode.cn id=7 lang=java
 *
 * [7] 整数反转
 *
 * https://leetcode-cn.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (31.75%)
 * Total Accepted:    94.3K
 * Total Submissions: 295.4K
 * Testcase Example:  '123'
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 
 * 示例 1:
 * 
 * 输入: 123
 * 输出: 321
 * 
 * 
 * 示例 2:
 * 
 * 输入: -123
 * 输出: -321
 * 
 * 
 * 示例 3:
 * 
 * 输入: 120
 * 输出: 21
 * 
 * 
 * 注意:
 * 
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。请根据这个假设，如果反转后整数溢出那么就返回
 * 0。
 * 
 */
class Solution {
    public int reverse(int x) {
        String[] xArr = (x + "").split("");
        boolean symbolFlag = false;
        
        symbolFlag = xArr[0].equals("-");
        
        int begin = 0;
        if (symbolFlag) {
            begin = 1;
        }
        String reverseValue = "";
        for (int i = xArr.length - 1; i >= begin; i--) {
            reverseValue += xArr[i];
        }
        
        int value;
        try {
            value = Integer.parseInt(reverseValue);
        } catch (NumberFormatException e) {
            return 0;
        }
        if (symbolFlag) {
            return -value;
        } else {
            return value;
        }
    }
}

