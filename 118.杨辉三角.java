import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 *
 * https://leetcode-cn.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (60.03%)
 * Total Accepted:    21.3K
 * Total Submissions: 34.8K
 * Testcase Example:  '5'
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 
 * 
 * 
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * 
 * 示例:
 * 
 * 输入: 5
 * 输出:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) {
            return new LinkedList<>();
        }
        List<List<Integer>> results = new LinkedList<>();
        List<Integer> handledList = new LinkedList<>();
        handledList.add(1);

        results.add(handledList);
        for (int i = 1; i < numRows; i++) {
            List<Integer> handled = new LinkedList<>();

            List<Integer> previous = results.get(i - 1);

            handled.add(1);
            for (int j = 0; j < previous.size() - 1; j ++) {
                handled.add(previous.get(j) + previous.get(j + 1));
            }
            handled.add(1);
            results.add(handled);
        }

        return results;
    }
}

