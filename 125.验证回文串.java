/*
 * @lc app=leetcode.cn id=125 lang=java
 *
 * [125] 验证回文串
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll(" ", "").replaceAll("\\,", "").replaceAll("\\:", "").replaceAll("\\.", "").replaceAll("\\@", "").replaceAll("\\#", "").replaceAll("\\-", "").replaceAll("\\?", "").replaceAll("\\\\", "").replaceAll("'", "").replaceAll("\"", "").replaceAll(";", "").replaceAll("!", "").replaceAll("\\(", "").replaceAll("\\)", "").replaceAll("\\`", "");
        // s = s.replaceAll("\\w\\s", "");
        s = s.toLowerCase();
        System.out.println(s);

        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i ++) {
            if (i < sArr.length / 2) {
                if (!sArr[i].equals(sArr[sArr.length - 1 - i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

