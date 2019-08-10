import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 *
 * https://leetcode-cn.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (42.92%)
 * Total Accepted:    9.6K
 * Total Submissions: 21.9K
 * Testcase Example:  '"egg"\n"add"'
 *
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * 
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * 
 * 示例 1:
 * 
 * 输入: s = "egg", t = "add"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * 
 * 示例 3:
 * 
 * 输入: s = "paper", t = "title"
 * 输出: true
 * 
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度。
 * 
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");

        Map<String, Integer> sMap = new HashMap<>();
        for (String eachS: sArr) {
            if (!sMap.containsKey(eachS)) {
                sMap.put(eachS, 0);
            }
            sMap.put(eachS, sMap.get(eachS) + 1);
        }

        Map<String, Integer> tMap = new HashMap<>();
        for (String eachT: tArr) {
            if (!tMap.containsKey(eachT)) {
                tMap.put(eachT, 0);
            }
            tMap.put(eachT, tMap.get(eachT) + 1);
        }

        Map<Integer, Integer> sOverview = new HashMap<>();
        Map<Integer, Integer> tOverview = new HashMap<>();

        List<Integer> sList = new LinkedList();
        List<Integer> tList = new LinkedList();

        for (Map.Entry<String, Integer> sEntry: sMap.entrySet()) {
            for (Map.Entry<String, Integer> tEntry: tMap.entrySet()) {
                if (tEntry.getValue() == sEntry.getValue()) {
                    tMap.put(tEntry.getKey(), -1);
                }
            }
        }

        for (Map.Entry<String, Integer> tEntry: tMap.entrySet()) {
            if (tEntry.getValue() != -1) {
                return false;
            }
        }
        return true;
    }
}

