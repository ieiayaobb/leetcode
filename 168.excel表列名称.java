/*
 * @lc app=leetcode.cn id=168 lang=java
 *
 * [168] Excel表列名称
 */
class Solution {
    int base = (int)'A';

    public String convertToTitle(int n) {
        String result = "";

        while (n > 0) {
            n --;
            int left = n % 26;
            result = cal(left) + result;
            n /= 26;
        }

        return result;
    }

    private String cal(int value) {
        return Character.toString((char)(base + value));
    }
}

