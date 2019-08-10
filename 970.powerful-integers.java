import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=970 lang=java
 *
 * [970] Powerful Integers
 *
 * https://leetcode-cn.com/problems/powerful-integers/description/
 *
 * algorithms
 * Easy (38.63%)
 * Total Accepted:    1.7K
 * Total Submissions: 4.6K
 * Testcase Example:  '2\n3\n10'
 *
 * 给定两个正整数 x 和 y，如果某一整数等于 x^i + y^j，其中整数 i >= 0 且 j >= 0，那么我们认为该整数是一个强整数。
 * 
 * 返回值小于或等于 bound 的所有强整数组成的列表。
 * 
 * 你可以按任何顺序返回答案。在你的回答中，每个值最多出现一次。
 * 
 * 
 * 
 * 示例 1：
 * 
 * 输入：x = 2, y = 3, bound = 10
 * 输出：[2,3,4,5,7,9,10]
 * 解释： 
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 * 
 * 
 * 示例 2：
 * 
 * 输入：x = 3, y = 5, bound = 15
 * 输出：[2,4,6,8,10,14]
 * 
 * 
 * 
 * 
 * 提示：
 * 
 * 
 * 1 <= x <= 100
 * 1 <= y <= 100
 * 0 <= bound <= 10^6
 * 
 * 
 */
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int max = Math.max(x, y);
        int maxPow = (int)Math.floor(Math.log(bound) / Math.log(max));

        // System.out.println(maxPow);

        Set<Integer> results = new HashSet<>();

        for (int i = 0; i <= maxPow; i++) {
            for (int j = 0; j <= maxPow; j++) {
                int temp = (int)(Math.pow(x, i) + Math.pow(y, j));
                if (temp <= bound) {
                    results.add(temp);
                }
            }
        }

        for (int i = 1; i <= maxPow; i++) {
            int temp = (int)(Math.pow(x, i));
            if (temp <= bound) {
                results.add(temp);
            }
        }

        for (int j = 1; j <= maxPow; j++) {
            int temp = (int)(Math.pow(y, j));
            if (temp <= bound) {
                results.add(temp);
            }
        }

        // System.out.println(results);
        List<Integer> resultList = new LinkedList();

        for (Integer i: results) {
            if (resultList.size() == 0) {
                resultList.add(i);
            } else {
                for (int k = 0; k < resultList.size(); k++) {
                    System.out.println(i);
                    if (resultList.get(k) < i ) {
                        if (k < resultList.size() - 1 && resultList.get(k + 1) < i) {
                            resultList.add(k + 1, i);
                        } else {
                            resultList.add(i);
                        }
                    } else {
                        resultList.add(k, i);
                    }
                    break;
                }
            }
        }
        return resultList;
    }
}

