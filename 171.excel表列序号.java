/*
 * @lc app=leetcode.cn id=171 lang=java
 *
 * [171] Excel表列序号
 */
class Solution {
    public int titleToNumber(String s) {
        int base = (int)'A' - 1;

        char[] ch = s.toCharArray();

        int sum = 0;
        for (int i = ch.length - 1; i >= 0; i --) {
            char c = ch[i];

            int baseVal = (int)Math.pow(26, ch.length - i - 1);
            int count = (int)c - base; 

            System.out.println(baseVal + " * " + count);
            
            sum += baseVal * count;;
        }
        return sum;
    }
}

