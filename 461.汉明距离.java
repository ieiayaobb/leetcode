/*
 * @lc app=leetcode.cn id=461 lang=java
 *
 * [461] 汉明距离
 *
 * https://leetcode-cn.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (67.80%)
 * Total Accepted:    14.9K
 * Total Submissions: 21.8K
 * Testcase Example:  '1\n4'
 *
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 
 * 注意：
 * 0 ≤ x, y < 2^31.
 * 
 * 示例:
 * 
 * 
 * 输入: x = 1, y = 4
 * 
 * 输出: 2
 * 
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 * 
 * 上面的箭头指出了对应二进制位不同的位置。
 * 
 * 
 */
class Solution {
    public int hammingDistance(int x, int y) {
        int max = Math.max(x, y);
        int result = 0;

        boolean prevX = false;
        boolean prevY = false;
        while (max != 1) {
            max = max / 2;

            int xLeft = 0;
            if (!prevX) {
                xLeft = x % 2;
            }

            int yLeft = 0;
            if (!prevY) {
                yLeft = y % 2;
            }            

            if (xLeft != yLeft) {
                result ++;
            }

            System.out.println(xLeft + " : " + yLeft);
            x = x / 2;
            y = y / 2;

            if (x == 1) {
                prevX = true;
            }
            if (y == 1) {
                prevY = true;
            }
        }

        if (x != y) {
            result ++;
        }
        return result;
    }
}

