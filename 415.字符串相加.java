import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=415 lang=java
 *
 * [415] 字符串相加
 *
 * https://leetcode-cn.com/problems/add-strings/description/
 *
 * algorithms
 * Easy (43.37%)
 * Total Accepted:    5.2K
 * Total Submissions: 11.9K
 * Testcase Example:  '"0"\n"0"'
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * 
 * 注意：
 * 
 * 
 * num1 和num2 的长度都小于 5100.
 * num1 和num2 都只包含数字 0-9.
 * num1 和num2 都不包含任何前导零。
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。
 * 
 * 
 */
class Solution {
    public String addStrings(String num1, String num2) {
        int maxLength = Math.max(num1.length(), num2.length());
        System.out.println(maxLength);

        if (num1.length() < maxLength) {
            int num1LengthDiff = maxLength - num1.length() - 1;
            for (int i = 0; i <= num1LengthDiff; i ++) {
                num1 = "0" + num1;
            }
        }

        if (num2.length() < maxLength) {
            int num2LengthDiff = maxLength - num2.length() - 1;
            for (int i = 0; i <= num2LengthDiff; i ++) {
                num2 = "0" + num2;
            }
        }

        System.out.println(num1 + " + " + num2);

        String[] num1Arr = num1.split("");
        String[] num2Arr = num2.split("");

        int increse[] = new int[num1.length() + 1];

        int result[] = new int[num1.length() + 1];

        for (int i = 0; i < maxLength; i ++) {
            int eachResult = Integer.parseInt(num1Arr[i]) + Integer.parseInt(num2Arr[i]) + increse[i];

            if (eachResult > 9) {
                increse[i + 1] = eachResult - 10;
            }

            result[i] = eachResult;
        }

        int finalResult = 0;
        for (int j = 0; j < result.length; j ++) {
            finalResult += result[j] * Math.pow(10, j);
        }

        return finalResult + "";
    }
}

