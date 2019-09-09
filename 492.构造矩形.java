/*
 * @lc app=leetcode.cn id=492 lang=java
 *
 * [492] 构造矩形
 */
class Solution {
    public int[] constructRectangle(int area) {
        int i = 1;
        int j = 1;
        for(i = (int)Math.floor(Math.sqrt(area)); i >= 1; i --) {
            if (area % i == 0) {
                j = area / i;
                break;
            }
        }
        int[] results = new int[2];
        results[0] = j;
        results[1] = i;
        return results;
    }
}

