/*
 * @lc app=leetcode.cn id=520 lang=java
 *
 * [520] 检测大写字母
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        char[] cs = word.toCharArray();

        Boolean flag = false;

        Boolean xflag = false;

        if (cs[0] >= 'A' && cs[0] <= 'Z') {
            flag = true;
        }

        for (int i = 1; i < cs.length; i ++) {
            if (cs[i] >= 'A' && cs[i] <= 'Z') {
                xflag ^= true;
            } else {
                xflag ^= false;
            }
        }
        
    }
}

