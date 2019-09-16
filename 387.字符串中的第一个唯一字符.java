import java.util.Set;

/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 0) {
            return -1;
        }
        Set exist = new HashSet<>();
        Set left = new HashSet<>();
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i ++) {
            char ele = cs[i];
            if (left.contains(ele)) {
                left.remove(ele);
            } else {
                if (!exist.contains(ele)) {
                    exist.add(ele);
                    left.add(ele);
                }
            }
        }
        for (int j = 0; j < cs.length; j ++) {
            if (left.contains(cs[j])) {
                return j;
            }
        }
        return -1;
    }
}

