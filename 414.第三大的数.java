/*
 * @lc app=leetcode.cn id=414 lang=java
 *
 * [414] 第三大的数
 */
class Solution {
    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;
    public int thirdMax(int[] nums) {
        for (int num: nums) {
            if (num == Integer.MIN_VALUE) {
                num ++;
            }
            if (num > first) {
                third = second;
                second = first;
                first = num;
            } else if (num > second) {
                if (num == first) {
                    continue;
                }
                third = second;
                second = num;
            } else if (num > third) {
                if (num == second) {
                    continue;
                }
                third = num;
            }
            System.out.println(first + ", " +  second + "," + third);
        }
        if (third == Integer.MIN_VALUE + 1) {
            return Integer.MIN_VALUE;
        }

        if (third == Integer.MIN_VALUE) {
            return first;
        }
        return third;
    }
}

