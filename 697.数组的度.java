/*
 * @lc app=leetcode.cn id=697 lang=java
 *
 * [697] 数组的度
 *
 * https://leetcode-cn.com/problems/degree-of-an-array/description/
 *
 * algorithms
 * Easy (44.92%)
 * Total Accepted:    3.4K
 * Total Submissions: 7.3K
 * Testcase Example:  '[1,2,2,3,1]'
 *
 * 给定一个非空且只包含非负数的整数数组 nums, 数组的度的定义是指数组里任一元素出现频数的最大值。
 * 
 * 你的任务是找到与 nums 拥有相同大小的度的最短连续子数组，返回其长度。
 * 
 * 示例 1:
 * 
 * 
 * 输入: [1, 2, 2, 3, 1]
 * 输出: 2
 * 解释: 
 * 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
 * 连续子数组里面拥有相同度的有如下所示:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * 最短连续子数组[2, 2]的长度为2，所以返回2.
 * 
 * 
 * 示例 2:
 * 
 * 
 * 输入: [1,2,2,3,1,4,2]
 * 输出: 6
 * 
 * 
 * 注意:
 * 
 * 
 * nums.length 在1到50,000区间范围内。
 * nums[i] 是一个在0到49,999范围内的整数。
 * 
 * 
 */
class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> resultMap = new HashMap<>();

        for (int num: nums) {
            if (!resultMap.containsKey(num)) {
                resultMap.put(num, 0);
            }
            resultMap.put(num, resultMap.get(num) + 1);
        }

        int max = 0;
        List<Integer> maxNumList = new ArrayList<>();
        // int[] maxNums = new int[nums.length];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
            System.out.println(entry.getKey() + " :: " + entry.getValue());
            if (entry.getValue() >= max) {
                max = entry.getValue();
            }
        }

        for (Map.Entry<Integer, Integer> entry: resultMap.entrySet()) {
            if (entry.getValue() == max) {
                maxNumList.add(entry.getKey());
                // maxNums[count ++] = entry.getKey();
            }
        }

        Integer[] array = new Integer[maxNumList.size()];
        Integer[] maxNums = maxNumList.toArray(array);

        System.out.println(max);

        int min = nums.length - 1;
        for (int maxNum: maxNums) {
            // if (maxNum > 0) {
                System.out.println("=======" + maxNum + "======");
                int left = 0;
                int right = 0;
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] == maxNum) {
                        left = i;
                        break;
                    }
                }
                for (int j = nums.length - 1; j >= 0; j--) {
                    if (nums[j] == maxNum) {
                        right = j;
                        break;
                    }
                }
                System.out.println(left);
                System.out.println(right);
                if (right - left < min) {
                    min = right - left;
                }
            }
        // }
        return min + 1;
    }
}

