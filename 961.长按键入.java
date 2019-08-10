/*
 * @lc app=leetcode.cn id=961 lang=java
 *
 * [961] 长按键入
 *
 * https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/description/
 *
 * algorithms
 * Easy (69.31%)
 * Total Accepted:    7.7K
 * Total Submissions: 11.4K
 * Testcase Example:  '[1,2,3,3]'
 *
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 
 * 返回重复了 N 次的那个元素。
 * 
 * 
 * 
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：[1,2,3,3]
 * 输出：3
 * 
 * 
 * 示例 2：
 * 
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 
 * 
 * 示例 3：
 * 
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 * 
 * 
 */
class Solution {
    public int repeatedNTimes(int[] A) {
        Map<Integer, Integer> result = new HashMap<>();
        for (int each: A) {
            if (!result.containsKey(each)) {
                result.put(each, 0);
            }
            result.put(each, result.get(each) + 1);
        }
        for (Map.Entry<Integer, Integer> entry: result.entrySet()) {
            if (entry.getValue() >= A.length / 2) {
                return entry.getKey();
            }
        }
        return 0;
    }
}

