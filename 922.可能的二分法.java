/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 可能的二分法
 *
 * https://leetcode-cn.com/problems/sort-array-by-parity-ii/description/
 *
 * algorithms
 * Easy (66.97%)
 * Total Accepted:    9.2K
 * Total Submissions: 14.1K
 * Testcase Example:  '[4,2,5,7]'
 *
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * 
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * 
 * 你可以返回任何满足上述条件的数组作为答案。
 * 
 * 
 * 
 * 示例：
 * 
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 * 
 * 
 * 
 * 
 */
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int j = A.length - 1;
        for (int i = 0; i < A.length; i ++) {
            for (; j >= 0; j--) {
                if (A[j] % 2 == 0 && j % 2 == 1) {
                    break;
                }
            }
            if (A[i] % 2 == 1 && i % 2 == 0) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }
}

