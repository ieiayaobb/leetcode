/*
 * @lc app=leetcode.cn id=788 lang=java
 *
 * [788] 旋转数字
 */
class Solution {
    public int rotatedDigits(int N) {
        int len = (int)Math.log10(N) + 1;

        System.out.println("len: " + len);
        int[] eles = {2, 5, 6, 9};

        int result = 0;
        for (int j = 0; j < len;) {
            int base = (int)Math.pow(10, j);
            System.out.println("base: " + base);
            for (int i = 0; i < eles.length; i ++, j ++) {
                result += i * base;
            }
            System.out.println(result);
        }

        return 1;
    }
}

