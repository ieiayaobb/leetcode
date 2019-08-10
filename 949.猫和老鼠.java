/*
 * @lc app=leetcode.cn id=949 lang=java
 *
 * [949] 猫和老鼠
 *
 * https://leetcode-cn.com/problems/largest-time-for-given-digits/description/
 *
 * algorithms
 * Easy (28.34%)
 * Total Accepted:    1.1K
 * Total Submissions: 3.9K
 * Testcase Example:  '[1,2,3,4]'
 *
 * 给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。
 * 
 * 最小的 24 小时制时间是 00:00，而最大的是 23:59。从 00:00 （午夜）开始算起，过得越久，时间越大。
 * 
 * 以长度为 5 的字符串返回答案。如果不能确定有效时间，则返回空字符串。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：[1,2,3,4]
 * 输出："23:41"
 * 
 * 
 * 示例 2：
 * 
 * 输入：[5,5,5,5]
 * 输出：""
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * A.length == 4
 * 0 <= A[i] <= 9
 * 
 * 
 */
import java.util.Arrays;

class Solution {
    public String largestTimeFromDigits(int[] A) {
        Arrays.sort(A);
        int hour_h = 0, hour_l = 0, minute_h = 0, minute_l = 0;

        

        for (int i = A.length - 1; i >= 0; i--) {
            if (each == 2) {

                hour_h = 2;
            }
            if (hour_h > 0 && hour_l > 0) {
                break;
            }
        }
        for (int i = A.length - 1; i >= 0; i--) {
            int each = A[i];
            if (each > 5) {
                minute_l = each;
                each = -1;
            } else {
                minute_h = each;
                each = -1;
            }
            if (minute_h > 0 && minute_l > 0) {
                break;
            }
        }
        return hour_h + hour_l + ":" + minute_h + minute_l;
    }
}

