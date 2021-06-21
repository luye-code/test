package 中等难度.最长回文子串之有必要看;

/*
 * 1.可以把每个char当作中心向两边遍历，遇到不相等的就终止
 * 2.使用dp的方法,状态转移方程是dp[i][j] = A.charAt(i)==A.charAt(j) && dp[i+1][j-1]
 * 3.马拉车算法 先在字符串间隔中拼接#使其变成奇数个字符，然后通过left 和 right决定区间，复杂度O(n)。
 * */

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public int getLongestPalindrome(String A, int n) {
        // write code here
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; l++) {
            // l代表长度,滑动窗口间隔
            for (int i = 0; i + l < n; ++i) {
                int j = i + l;

                if (l == 0) {
                    dp[i][j] = true;
                } else if (l == 1) {
                    dp[i][j] = A.charAt(i) == A.charAt(j);
                } else {
                    dp[i][j] = (A.charAt(i) == A.charAt(j)) && dp[i + 1][j - 1];
                }
                if (dp[i][j] && l + 1 > ans.length()) {
                    // 更新最大长度 保存子串
                    ans = A.substring(i, i + l + 1);
                }
            }

        }
        return ans.length();

    }

    public static void main(String[] args) {
        Solution s = new Solution();
//        s.getLongestPalindrome("baabccc", 7);
        s.ManacherWay("baabccc", 7);
    }

    public int ManacherWay(String A, int n) {
        StringBuilder sb = new StringBuilder("#");
        for (int i = 0; i < A.length(); i++) {
            sb.append(A.charAt(i));
            sb.append("#");
        }
//        int left = 0, right = 0;
        int[] dp = new int[sb.length()];
        // 双指针，它们是一一对应的，须同时更新
        int maxRight = 0;
        int center = 0;//关于center对称

        // 当前遍历的中心最大扩散步数，其值等于原始字符串的最长回文子串的长度
        int maxLen = 1;
        for (int i = 0; i < sb.length(); i++) {
            //1.如果在回文内，通过mirror更新dp[i]
            if (i < maxRight) {
                int mirror = center - (i - center);
                dp[i] = Math.min(maxRight - i, dp[mirror]);
            }

            //2.更新每轮的对称区间
            int left = i - (1 + dp[i]);
            int right = i + (1 + dp[i]);

            //3.尝试扩大对称区间
            while ((left >= 0 && right < sb.length()) && sb.charAt(left) == sb.charAt(right)) {
                dp[i]++;
                left--;
                right++;

            }
            //4.检验是否需要扩大maxRight
            if (i + dp[i] > maxRight) {
                maxRight = i + dp[i]; //一次就更新当前下标+半径
                center = i;
            }
            if (dp[i] > maxLen) {
                // 记录最长回文子串的长度和相应它在原始字符串中的起点
                maxLen = dp[i];
            }
        }
        System.out.println(maxLen);
        return maxLen;
    }

    public int 马拉车(String A, int n) {
        StringBuilder sb = new StringBuilder("#");
        for (int i = 0; i < n; i++) {
            sb.append(A.charAt(i));
            sb.append("#");
        }
        int maxRight = 0, center = 0;
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < maxRight) { // #a#b#c#c#b#a#       a#b#c#c#b#a#
                                // 000000600000     12      600000
                int mirror = 2 * center - i;
                dp[i] = Math.min(dp[mirror], maxRight - i); //
            }

            int left = i - 1 - dp[i], right = i + 1 + dp[i]; //从新的地方开始找
            while (left >= 0 && right < n && sb.charAt(left) == sb.charAt(right)) {
                left--;
                right++;
                dp[i]++;
            }
            if (i + dp[i] > maxRight) {
                maxRight = i + dp[i];
                center = i;
            }
        }
        return 1;
    }
}