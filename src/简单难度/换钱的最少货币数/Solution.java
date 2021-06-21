package 简单难度.换钱的最少货币数;

import java.util.*;


public class Solution {
    /**
     * 最少货币数
     *
     * @param arr int整型一维数组 the array
     * @param aim int整型 the target
     * @return int整型
     */
    public int minMoney(int[] arr, int aim) {
        // write code here
        int[] count = new int[aim + 1];
        Arrays.fill(count, aim + 1);
        count[0] = 0;
        for (int i = 1; i <= aim; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i >= arr[j]) {
                    count[i] = Math.min(count[i - arr[j]] + 1, count[i]);
                }
            }

        }
        return count[aim] != aim + 1 ? count[aim] : -1;
    }
}