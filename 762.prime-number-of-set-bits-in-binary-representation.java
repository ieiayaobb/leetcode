/*
 * @lc app=leetcode.cn id=762 lang=java
 *
 * [762] Prime Number of Set Bits in Binary Representation
 */
class Solution {
    public int countPrimeSetBits(int L, int R) {
        int eachCount = 0;
        for (int each = L; each <= R; each ++) {
            int left = each;
            int count = 0;
            while (left > 1) {
                if (left % 2 == 1) {
                    count ++;
                }
                left = left / 2;
            }
            count ++;
            // System.out.println(each + " = " + count);

            // System.out.println(count);

            // if (count == 1) {
                // break;
            // }
            int max = (int)Math.sqrt(count);
            // System.out.println(each + " = " + count);

            int limit = count <= 2 ? 2 : count - 1;

            for (int i = 2; i <= limit; i++) {
                // System.out.println(each);
                if (count == 2) {
                    count ++;
                }
                if (count == 1 || count % i == 0) {
                    break;
                }
                if (i == limit) {
                    eachCount ++;
                }
            }
        }

        return eachCount;
    }
}

