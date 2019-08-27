/*
 * @lc app=leetcode.cn id=367 lang=java
 *
 * [367] 有效的完全平方数
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        for (int i = 1; i <= Math.sqrt(num); i ++) {
            if (i * i == num) {
                return true;
            }
        }
        return false;
    }
}

