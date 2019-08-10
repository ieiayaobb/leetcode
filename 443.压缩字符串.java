/*
 * @lc app=leetcode.cn id=443 lang=java
 *
 * [443] 压缩字符串
 */
class Solution {
    public int compress(char[] chars) {
        int count = 0;

        char prev = ' ';
        int cat = 0;

        int total = 0;
        for (char c: chars) {
            if (c == prev) {
                count ++;
            } else {
                cat ++;
                total += (count + "").length();
                count = 0;
            }
            prev = c;
        }
        return total + cat;
    }
}

