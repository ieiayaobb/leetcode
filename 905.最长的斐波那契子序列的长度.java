/*
 * @lc app=leetcode.cn id=905 lang=java
 *
 * [905] 最长的斐波那契子序列的长度
 *
 * https://leetcode-cn.com/problems/sort-array-by-parity/description/
 *
 * algorithms
 * Easy (69.44%)
 * Total Accepted:    14.6K
 * Total Submissions: 21.4K
 * Testcase Example:  '[3,1,2,4]'
 *
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * 
 * 你可以返回满足此条件的任何数组作为答案。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * 
 * 
 */
class Solution {
    public int[] sortArrayByParity(int[] A) {
        int j = A.length - 1;

        for (int i = 0; i < A.length; i ++) {
            for(; j >= 0; j --) {
                System.out.println(i + " : " + j);

                if (A[j] % 2 == 0) {
                    break;
                }
            }
            if (i >= j) {
                return A;
            } 
            if (A[i] % 2 == 1) {

                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}

