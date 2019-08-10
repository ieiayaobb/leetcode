import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=448 lang=java
 *
 * [448] 找到所有数组中消失的数字
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> exists = new HashSet<>();
        List<Integer> results = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (exists.contains(num)) {
                results.add(i);
            }
            exists.add(num);
        }
        return results;
    }
}

