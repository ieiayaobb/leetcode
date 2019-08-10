/*
 * @lc app=leetcode.cn id=796 lang=java
 *
 * [796] 到达终点
 *
 * https://leetcode-cn.com/problems/rotate-string/description/
 *
 * algorithms
 * Easy (44.93%)
 * Total Accepted:    3.2K
 * Total Submissions: 6.9K
 * Testcase Example:  '"abcde"\n"cdeab"'
 *
 * 给定两个字符串, A 和 B。
 * 
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。 例如, 若 A = 'abcde'，在移动一次之后结果就是'bcdea'
 * 。如果在若干次旋转操作之后，A 能变成B，那么返回True。
 * 
 * 
 * 示例 1:
 * 输入: A = 'abcde', B = 'cdeab'
 * 输出: true
 * 
 * 示例 2:
 * 输入: A = 'abcde', B = 'abced'
 * 输出: false
 * 
 * 注意：
 * 
 * 
 * A 和 B 长度不超过 100。
 * 
 * 
 */
class Solution {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        if (A.length() != B.length()) {
            return false;
        }
        String[] aArr = A.split("");
        String[] bArr = B.split("");

        int match = 0;

        boolean consist = false;

        int i = 0, j = 0;

        int jVisited = 0;

        for (; i < aArr.length;) {
            for (; j < bArr.length;) {
                jVisited ++;
                System.out.println(aArr[i] + " = " + bArr[j]);
                if (bArr[j].equals(aArr[i])) {
                    match ++;
                    consist = true;
                    i++;
                    j++;
                    if (j >= bArr.length) {
                        j = 0;
                    }
                } else {
                    j++;
                    if (j >= bArr.length) {
                        j = 0;
                        i++;
                    }
                    if (consist) {
                        return match == A.length();
                    }
                    // if (jVisited > B.length()) {
                        // return false;
                    // }
                }
            }
        }
        return match == A.length();
    }
}

