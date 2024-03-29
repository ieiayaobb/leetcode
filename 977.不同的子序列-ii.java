/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 不同的子序列 II
 *
 * https://leetcode-cn.com/problems/squares-of-a-sorted-array/description/
 *
 * algorithms
 * Easy (73.56%)
 * Total Accepted:    7.1K
 * Total Submissions: 9.9K
 * Testcase Example:  '[-4,-1,0,3,10]'
 *
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 
 * 
 * 示例 2：
 * 
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 * 
 * 
 */
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] powA = Arrays.stream(A).map(a -> (int)Math.pow(a, 2)).toArray();            
        Arrays.sort(powA);
        return powA;
    }
}

