import java.util.LinkedList;

/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 设计循环双端队列
 *
 * https://leetcode-cn.com/problems/buddy-strings/description/
 *
 * algorithms
 * Easy (24.11%)
 * Total Accepted:    3.8K
 * Total Submissions: 15.2K
 * Testcase Example:  '"ab"\n"ba"'
 *
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false
 * 。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 
 * 
 * 示例 2：
 * 
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 
 * 
 * 示例 3:
 * 
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 
 * 
 * 示例 4：
 * 
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 
 * 
 * 示例 5：
 * 
 * 输入： A = "", B = "aa"
 * 输出： false
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A 和 B 仅由小写字母构成。
 * 
 * 
 */
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.equals("")) {
            return false;
        }
        
        if (A.length() != B.length()) {
            return false;
        }

        String[] aArr = A.split("");
        String[] bArr = B.split("");

        boolean same = true;
        for (int i = 0; i < aArr.length - 1; i++) {
            if (!aArr[i].equals(aArr[i + 1])) {
                same = false;
            }
        }

        if (same) {
            return same;
        }

        String tempA = "", tempB = "";

        boolean flag = false;
        boolean more = false;

        for (int i = 0; i < aArr.length; i++) {
            // System.out.println(aArr[i]);
            if (!aArr[i].equals(bArr[i])) {
                if (more) {
                    return false;
                }
                // System.out.println(flag);
                if (flag) {
                    // System.out.println(i);
                    if (i == aArr.length - 1) {
                        return aArr[i].equals(tempB) && bArr[i].equals(tempA);
                    } else {
                        more = true;
                    }
                }
                flag = true;
                tempA = aArr[i];
                tempB = bArr[i];
            }
        }
        return false;
    }
}

