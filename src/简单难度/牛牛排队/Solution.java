package 简单难度.牛牛排队;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.19 22:38
 * @Version: 1.0
 */


import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * <p>
     * 返回牛牛最终是从第几个门进入食堂吃饭的
     *
     * @param n int整型 代表门的数量
     * @param a int整型一维数组 代表每个门外等待的人数
     * @return int整型
     */
    public int nowcoderQueue(int n, int[] a) {
        // write code here
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        int tmp = min / n;
        for (int i = 0; i < n; i++) {
            a[i] = a[i] - tmp * n;
            if (a[i] < i) {
                return i + 1;
            }
            a[i] = a[i] - n;

        }
        for (int i = 0; i < n; i++) {
            if (a[i] <= 0)
                return i + 1;
        }
        return -1;
    }
}