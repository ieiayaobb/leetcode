import java.util.List;

/*
 * @lc app=leetcode.cn id=202 lang=java
 *
 * [202] 快乐数
 *
 * https://leetcode-cn.com/problems/happy-number/description/
 *
 * algorithms
 * Easy (52.20%)
 * Total Accepted:    12.3K
 * Total Submissions: 23.6K
 * Testcase Example:  '19'
 *
 * 编写一个算法来判断一个数是不是“快乐数”。
 * 
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到
 * 1。如果可以变为 1，那么这个数就是快乐数。
 * 
 * 示例: 
 * 
 * 输入: 19
 * 输出: true
 * 解释: 
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 * 
 */
class Solution {
    public boolean isHappy(int n) {
        List<Integer> results = new LinkedList<>();
        while (n != 1) {
            if (results.contains(n)) {
                return false;
            }

            int result = 0;
            for (String var : (n + "").split("")) {
                result += Math.pow(Integer.parseInt(var), 2);
            }
            results.add(n);
            n = result;
        }
        return true;
    }
}

