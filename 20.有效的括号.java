import java.util.Stack;

/*
 * @lc app=leetcode.cn id=20 lang=java
 *
 * [20] 有效的括号
 *
 * https://leetcode-cn.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (36.57%)
 * Total Accepted:    51.5K
 * Total Submissions: 140.2K
 * Testcase Example:  '"()"'
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 
 * 有效字符串需满足：
 * 
 * 
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 
 * 
 * 注意空字符串可被认为是有效字符串。
 * 
 * 示例 1:
 * 
 * 输入: "()"
 * 输出: true
 * 
 * 
 * 示例 2:
 * 
 * 输入: "()[]{}"
 * 输出: true
 * 
 * 
 * 示例 3:
 * 
 * 输入: "(]"
 * 输出: false
 * 
 * 
 * 示例 4:
 * 
 * 输入: "([)]"
 * 输出: false
 * 
 * 
 * 示例 5:
 * 
 * 输入: "{[]}"
 * 输出: true
 * 
 */
class Solution {
    public boolean isValid(String s) {
        if (s.equals("")) {
            return true;
        }

        String[] sArr = s.split("");
        Stack<String> stack = new Stack();

        boolean result = true;
        for (String each: sArr) {
            if (each.equals(")")) {
                result &= stack.size() > 0 && stack.pop().equals("(");
            } else if (each.equals("]")) {
                result &= stack.size() > 0 && stack.pop().equals("[");
            } else if (each.equals("}")) {
                result &= stack.size() > 0 && stack.pop().equals("{");
            } else {
                stack.push(each);
            }
        }
        return result & stack.size() == 0;
    }
}

