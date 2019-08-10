import java.util.Set;

/*
 * @lc app=leetcode.cn id=929 lang=java
 *
 * [929] 特殊等价字符串组
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        for (String email: emails) {
            String prefix = email.split("@")[0];
            String suffix = email.split("@")[1];
            if (prefix.contains(".")) {
                prefix = prefix.replaceAll("\\.", "");
                email = prefix + "@" + suffix;
            }
            if (email.contains("+")) {
                email = email.substring(0, email.indexOf("+"));
                email += "@" + suffix;
            }
            System.out.println(email);
            emailSet.add(email);
        }
        return emailSet.size();
    }
}

