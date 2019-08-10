import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 *
 * https://leetcode-cn.com/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (59.96%)
 * Total Accepted:    17.6K
 * Total Submissions: 28.6K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 
 * 示例 1:
 * 
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 
 * 
 * 示例 2:
 * 
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 
 * 说明:
 * 
 * 
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 * 
 * 
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> original = new HashSet<>();
        for (int num1: nums1) {
            original.add(num1);
        }

        List<Integer> results = new ArrayList<>();
        for (int i, j = 0; i < nums2.length; i++) {
            int num2 = nums2[i];
            if (original.contains(num2)) {
                results.add(num2);
            }
        }
        // int arr = new int[results.size() - 1];
        return results.toArray(new Integer[results.size() - 1]);
    }
}

