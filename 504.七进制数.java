/*
 * @lc app=leetcode.cn id=504 lang=java
 *
 * [504] 七进制数
<<<<<<< HEAD
 */
class Solution {
    public String convertToBase7(int num) {
        
=======
 *
 * https://leetcode-cn.com/problems/base-7/description/
 *
 * algorithms
 * Easy (42.12%)
 * Total Accepted:    2.7K
 * Total Submissions: 6.3K
 * Testcase Example:  '100'
 *
 * 给定一个整数，将其转化为7进制，并以字符串形式输出。
 * 
 * 示例 1:
 * 
 * 
 * 输入: 100
 * 输出: "202"
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: -7
 * 输出: "-10"
 * 
 * 
 * 注意: 输入范围是 [-1e7, 1e7] 。
 * 
 */
class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        Boolean flag = false;
        if (num < 0) {
            flag = true;
            num = -num;
        }
        String result = "";
        while (num > 0) {
            int left = num % 7;
            result = left + result;
            num = num / 7;
        }
        if (flag) {
            result = "-" + result;
        }
        return result;
>>>>>>> 54f0bb9... init mac folder
    }
}

