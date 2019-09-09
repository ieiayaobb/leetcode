/*
 * @lc app=leetcode.cn id=509 lang=java
 *
 * [509] 斐波那契数
 */
class Solution {
    public int fib(int N) {
        return check(N);
    }

    private int check(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return check(n-1) + check(n-2);
        }
    }
}

