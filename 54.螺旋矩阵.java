import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=54 lang=java
 *
 * [54] 螺旋矩阵
 *
 * https://leetcode-cn.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (33.97%)
 * Total Accepted:    10.9K
 * Total Submissions: 31.6K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 * 
 * 示例 1:
 * 
 * 输入:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * 输出: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * 示例 2:
 * 
 * 输入:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * 输出: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 * 
 */
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new LinkedList<>();

        int totalHeight = matrix.length;
        if (matrix.length > 0) {
            int totalWidth = matrix[0].length;

            int levelCount = (int) Math.ceil((float)Math.min(totalWidth, totalHeight) / 2);

            for (int i = 0; i < levelCount; i++) {
                result.addAll(innerTravel(matrix, i));
            }
        }
        return result;
    }

    private List<Integer> innerTravel(int[][] subMatrix, int headRow) {
        int width = subMatrix[headRow].length - headRow * 2;
        int height = subMatrix.length - headRow * 2;

        List<Integer> firstRow = new LinkedList();
        List<Integer> firstCol = new LinkedList();
        List<Integer> lastRow = new LinkedList();
        List<Integer> lastCol = new LinkedList();

        if (width == 1 && height == 1) {
            return Arrays.asList(subMatrix[headRow][headRow]);
        }

        if (width == 1) {
            for (int i = headRow; i <= height - 1 + headRow; i++) {
                lastCol.add(subMatrix[i][headRow]);
            }
            return lastCol;
        }

        if (height == 1) {
            for (int i = headRow; i <= width - 1 + headRow; i++) {
                firstRow.add(subMatrix[headRow][i]);
            }
            return firstRow;
        }

        for (int i = headRow; i <= width - 2 + headRow; i++) {
            firstRow.add(subMatrix[headRow][i]);
        }

        for (int i = headRow; i <= height - 2 + headRow; i++) {
            lastCol.add(subMatrix[i][headRow + width - 1]);
        }

        for (int i = width - 1 + headRow; i >= headRow + 1; i--) {
            lastRow.add(subMatrix[height - 1 + headRow][i]);
        }

        for (int i = height - 1 + headRow; i >= headRow + 1; i--) {
            firstCol.add(subMatrix[i][headRow]);
        }

        List result = new LinkedList<>();
        result.addAll(firstRow);
        result.addAll(lastCol);
        result.addAll(lastRow);
        result.addAll(firstCol);

        return result;
    }
}

