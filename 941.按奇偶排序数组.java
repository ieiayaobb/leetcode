/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 按奇偶排序数组
 */
class Solution {
    public boolean validMountainArray(int[] A) {
        boolean upFlag = true;
        boolean downFlag = true;
        for (int i = 1; i < A.length; i ++) {
            if (A[i] > A[i - 1]) {
                upFlag = true;
            } else {
                
            }
        }
    }
}

