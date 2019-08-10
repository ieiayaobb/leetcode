import java.util.Map;

/*
 * @lc app=leetcode.cn id=575 lang=java
 *
 * [575] 分糖果
 *
 * https://leetcode-cn.com/problems/distribute-candies/description/
 *
 * algorithms
 * Easy (58.39%)
 * Total Accepted:    4.7K
 * Total Submissions: 8.1K
 * Testcase Example:  '[1,1,2,2,3,3]'
 *
 * 
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 * 
 * 示例 1:
 * 
 * 
 * 输入: candies = [1,1,2,2,3,3]
 * 输出: 3
 * 解析: 一共有三种种类的糖果，每一种都有两个。
 * ⁠    最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * 
 * 
 * 示例 2 :
 * 
 * 
 * 输入: candies = [1,1,2,3]
 * 输出: 2
 * 解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 * 
 * 
 * 注意:
 * 
 * 
 * 数组的长度为[2, 10,000]，并且确定为偶数。
 * 数组中数字的大小在范围[-100,000, 100,000]内。
 * 
 * 
 * 
 * 
 * 
 */
class Solution {
    public int distributeCandies(int[] candies) {
        Map<Integer, Integer> candyMap = new HashMap<>();

        int max = 0;
        for (int candy: candies) {
            if (!candyMap.containsKey(candy)) {
                candyMap.put(candy, 0);
            }
            int current = candyMap.get(candy) + 1;

            if (current > max) {
                max = current;
            }
            candyMap.put(candy, current);
        }

        if (candyMap.size() <= candies.length / 2) {
            return candyMap.size();
        }

        int half = 0;
        int cate = 0;
        System.out.println(max);
        for (int i = 0; i <= max; i++) {
            for (Map.Entry<Integer, Integer> entry: candyMap.entrySet()) {
                if (entry.getValue() >= i && half < candies.length / 2) {
                    System.out.println(entry.getKey());
                    half ++;
                    cate ++;
                }
            }
        }
        return cate;
    }
}

