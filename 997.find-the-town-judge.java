import java.util.Map;
import java.util.Set;

/*
 * @lc app=leetcode.cn id=997 lang=java
 *
 * [997] Find the Town Judge
 */
class Solution {
    public int findJudge(int N, int[][] trust) {
        if (trust.length == 0) {
            return 1;
        }
        int target = -1;

        Map<Integer, Integer> trustMap = new HashMap<>();

        Set<Integer> keySet = new HashSet<>();
        for(int[] eachTrust: trust) {
            if (!trustMap.containsKey(eachTrust[1])) {
                trustMap.put(eachTrust[1], 0);
            }
            trustMap.put(eachTrust[1], trustMap.get(eachTrust[1]) + 1);

            if (trustMap.get(eachTrust[1]) == N - 1) {
                target = eachTrust[1];
            }
            keySet.add(eachTrust[0]);
        }

        if (keySet.contains(target)) {
            return -1;
        }
        return target;
    }
}

