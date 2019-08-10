import java.util.Set;

/*
 * @lc app=leetcode.cn id=14 lang=java
 *
 * [14] 最长公共前缀
 *
 * https://leetcode-cn.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (32.11%)
 * Total Accepted:    54.6K
 * Total Submissions: 169.9K
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 
 * 如果不存在公共前缀，返回空字符串 ""。
 * 
 * 示例 1:
 * 
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 
 * 
 * 示例 2:
 * 
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 
 * 
 * 说明:
 * 
 * 所有输入只包含小写字母 a-z 。
 * 
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        Set eachSet = new HashSet();
        for (int j = 0; j < Integer.MAX_VALUE; j++) {
            String value = "";
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].length() == 0) {
                    return "";
                }
                if (strs[i].length() > j) {
                    value = strs[i].charAt(j) + "";
                    eachSet.add(value);
                } else {
                    return result;
                }
            }
            
            if (eachSet.size() == 1) {
                result += value;
                eachSet = new HashSet();
            } else {
                break;
            }
        }
        return result;
    }
}

