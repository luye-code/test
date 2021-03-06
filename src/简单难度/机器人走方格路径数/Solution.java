package 简单难度.机器人走方格路径数;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.18 20:18
 * @Version: 1.0
 */

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            dp[i][1] = 1;
        }//第一列赋值为1
        for (int j = 1; j <= n; j++) {
            dp[1][j] = 1;
        }//第一行赋值为1
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}