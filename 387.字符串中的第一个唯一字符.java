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
        if (s.length() == 1) {
            return 0;
        }
        int max = 0;
        int i;
        for(i = 0; i < s.length(); i++){
            char c1 = s.charAt(i);
            if (exist.contains(c1)) {
                max ++;
                continue;
            }
            System.out.println(c1);
            int j;
            for(j = i + 1; j < s.length(); j++){
                char c2 = s.charAt(j);
                if (c1 == c2) {
                    exist.add(c1);
                    max ++;
                    break;
                }
            }
            System.out.println(j);
            if (j == s.length()) {
                if (max == s.length() - 1) {
                    return -1;
                }
                return max;
            }
        }

        System.out.println(i);
        if (i == s.length()) {
            if (!exist.contains(s.charAt(i - 1))) {
                return i;
            }
        }

        return -1;
    }
}

