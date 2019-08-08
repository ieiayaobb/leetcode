/*
 * @lc app=leetcode.cn id=28 lang=java
 *
 * [28] 实现strStr()
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }
        if (haystack.equals(needle)) {
            return 0;
        }
        String[] haystackArr = haystack.split("");
        String[] needleArr = needle.split("");

        int count = 0;
        for (int i = count; i < haystackArr.length; ){
            for (int j = 0; j < needle.length(); ) {
                System.out.println(i + ":" + haystackArr[i] + " = " + j + ":" + needleArr[j]);
                if (haystackArr[i].equals(needleArr[j])) {
                    if (i ++ == haystackArr.length - 1 && j < needleArr.length -1) {
                        return -1;
                    }
                    if (j ++ == needleArr.length - 1) {
                        return i - j;
                    }
                } else {
                    i = ++ count;
                    if (i == haystackArr.length - 1) {
                        return -1;
                    }
                    break;
                }
            }
        }
        return -1;
    }
}

