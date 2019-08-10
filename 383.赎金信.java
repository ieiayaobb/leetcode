import java.util.Map;

/*
 * @lc app=leetcode.cn id=383 lang=java
 *
 * [383] 赎金信
 *
 * https://leetcode-cn.com/problems/ransom-note/description/
 *
 * algorithms
 * Easy (44.79%)
 * Total Accepted:    5.8K
 * Total Submissions: 12.5K
 * Testcase Example:  '"a"\n"b"'
 *
 * 给定一个赎金信 (ransom)
 * 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回
 * true ；否则返回 false。
 * 
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 * 
 * 注意：
 * 
 * 你可以假设两个字符串均只含有小写字母。
 * 
 * 
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 * 
 * 
 */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.equals("")) {
            return true;
        }
        Map<String, Integer> possibleMap = new HashMap<>();
        String[] magArr = magazine.split("");
        String[] ranArr = ransomNote.split("");
        if (magArr.length < ranArr.length) {
            return false;
        }

        for (int i = 0; i < magArr.length; i++) {
            String magKey = magArr[i];
            if (!possibleMap.containsKey(magKey)) {
                possibleMap.put(magKey, 0);
            }
            possibleMap.put(magKey, possibleMap.get(magKey) + 1);
            
            if (ranArr.length > i) {
                String ranKey = ranArr[i];
                if (!possibleMap.containsKey(ranKey)) {
                    possibleMap.put(ranKey, 0);
                }
                possibleMap.put(ranKey, possibleMap.get(ranKey) - 1);
            }
        }

        for (Map.Entry<String, Integer> entry : possibleMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
            if (entry.getValue() < 0) {
                return false;
            }
        }
        return true;
    }
}

