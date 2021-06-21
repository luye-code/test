package 简单难度.数组元素交换;

import java.util.*;


public class Solution {
    /**
     * @param a int整型一维数组 原始数组a
     * @param n int整型 第n大
     * @param m int整型 第m大
     * @return int整型一维数组
     */
    public int[] sovle(int[] a, int n, int m) {
        // write code here
        int[] array_copy = Arrays.copyOf(a, a.length);
        Arrays.sort(a);
        int n_val = a[a.length - n];
        int m_val = a[a.length - m];
        for (int i = 0; i < array_copy.length; i++) {
            if (array_copy[i] == n_val) {
                array_copy[i] = m_val;
            } else if (array_copy[i] == m_val) {
                array_copy[i] = n_val;
            }
        }
        return array_copy;

    }
}
