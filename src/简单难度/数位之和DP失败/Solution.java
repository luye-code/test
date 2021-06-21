package 简单难度.数位之和DP失败;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.20 13:06
 * @Version: 1.0
 */


public class Solution {
    /**
     * 返回这样的数之和
     *
     * @param n int整型 数的长度
     * @param m int整型 各个为之和
     * @return long长整型
     */
    public static long sum(int n, int m) {
        int[][] dp = new int[n + 1][9 * n + 1];
        for (int i = 1; i <= n; i++) {
            dp[i][0] = 1;
            dp[i][i * 9] = 1;

        }
        //dp[i][j]定义：i位数中 各位之和为j 的数量
        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }

        int a = 1;
        return 5;
    }

    public static void main(String[] args) {
        sum(5,45);
    }
}