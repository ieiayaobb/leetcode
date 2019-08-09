/*
 * @lc app=leetcode.cn id=204 lang=java
 *
 * [204] 计数质数
 */
class Solution {
    public int countPrimes(int n) {
        boolean [] notPrim = new boolean[n];
        System.out.println(notPrim);
        int count = 0;
        for (int i = 2; i < n; i++){
            if (notPrim[i] == false) {
                count++;
                for (int j = 2; j*i < n; j++) {
                    notPrim[j*i] = true;
                }
            }
        }
        return count;
    }
    // public int countPrimes(int n) {
    //     int count = 0;

    //     for (int i = 2; i < n; i ++) {
    //         System.out.println("=> [i: " + i + "]");
    //         boolean flag = false;
            
    //         for (int j = 2; j * j <= i; j ++) {
    //             // System.out.println("[j: " + j + "]");
    //             if (i % j == 0 && i != j) {
    //                 // System.out.println("==");
    //                 flag = true;
    //                 break;
    //             }
    //         }

    //         if (!flag) {
    //             System.out.println("++");
    //             count ++;
    //         }
    //     }
    //     return count;
    // }
}

