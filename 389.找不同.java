import java.util.Map;

/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 *
 * https://leetcode-cn.com/problems/find-the-difference/description/
 *
 * algorithms
 * Easy (54.32%)
 * Total Accepted:    7.8K
 * Total Submissions: 14.1K
 * Testcase Example:  '"abcd"\n"abcde"'
 *
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 * 
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 * 
 * 请找出在 t 中被添加的字母。
 * 
 * 
 * 
 * 示例:
 * 
 * 输入：
 * s = "abcd"
 * t = "abcde"
 * 
 * 输出：
 * e
 * 
 * 解释：
 * 'e' 是那个被添加的字母。
 * 
 * 
 */
class Solution {
    public char findTheDifference(String s, String t) {
        if (s.equals("")) {
            return t.toCharArray()[0];
        }
        Map<String, Integer> possibleMap = new HashMap<>();
        String[] sArr = s.split("");
        String[] tArr = t.split("");

        for (int i = 0; i < tArr.length; i++) {
            String tKey = tArr[i];
            if (!possibleMap.containsKey(tKey)) {
                possibleMap.put(tKey, 0);
            }
            possibleMap.put(tKey, possibleMap.get(tKey) + 1);
            
            if (sArr.length > i) {
                String sKey = sArr[i];
                if (!possibleMap.containsKey(sKey)) {
                    possibleMap.put(sKey, 0);
                }
                possibleMap.put(sKey, possibleMap.get(sKey) - 1);
            }
        }

        for (Map.Entry<String, Integer> entry : possibleMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            if (entry.getValue() > 0) {
                return entry.getKey().toCharArray()[0];
            }
        }
        return ' ';
    }
}

