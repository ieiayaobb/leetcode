/*
 * @lc app=leetcode.cn id=693 lang=java
 *
 * [693] 交替位二进制数
 */
class Solution {
    public boolean hasAlternatingBits(int n) {
        return reverseCheck(n, false, true);
    }

    private boolean reverseCheck(int target, boolean flag) {
        System.out.println(target + " : " + flag);
        int result = target % 2;
        if (flag && result == 1) {
            return false;
        } else if (!flag && result == 0) {
            return false;
        }
        return reverseCheck(target / 2, result == 1);
    }

    private boolean reverseCheck(int target, boolean flag, boolean special) {
        if (sepcial) {
            return true;
        } else {
            return reverseCheck(target, flag);
        }
    }
}

