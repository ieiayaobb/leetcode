import java.util.Map;

/*
 * @lc app=leetcode.cn id=198 lang=java
 *
 * [198] 打家劫舍
 *
 * https://leetcode-cn.com/problems/house-robber/description/
 *
 * algorithms
 * Easy (39.18%)
 * Total Accepted:    21.8K
 * Total Submissions: 55.1K
 * Testcase Example:  '[1,2,3,1]'
 *
 * 
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你在不触动警报装置的情况下，能够偷窃到的最高金额。
 * 
 * 示例 1:
 * 
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 * 偷窃到的最高金额 = 1 + 3 = 4 。
 * 
 * 示例 2:
 * 
 * 输入: [2,7,9,3,1]
 * 输出: 12
 * 解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 * 偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 * 
 * 
 */
class Solution {
    private int[] _nums;

    private Map<Integer, Integer> resultMap = new HashMap<>();

    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        _nums = nums;

        return cal(_nums.length - 1);
    }

    private int cal(int i) {
        if (i == 0) {
            return _nums[0];
        }

        if (i == 1) {
            return Math.max(_nums[0], _nums[1]);
        }

        int tempMax;
        if (resultMap.containsKey(i)) {
            return resultMap.get(i);
        } else {
            tempMax = Math.max(cal(i - 1), cal(i - 2) + _nums[i]);
            resultMap.put(i, tempMax);
        }

        return tempMax;
    }
}

