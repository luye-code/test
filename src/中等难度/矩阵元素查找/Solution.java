package 中等难度.矩阵元素查找;

import java.util.*;
/*
* 由于不含重复值，可以直接从左下角寻找，不会错过目标值。
* */

public class Solution {
    public int[] findElement(int[][] mat, int n, int m, int x) {
        int nn = n - 1;
        int mm = 0;
        while (nn >= 0 && mm <= m - 1) {

            if (mat[nn][mm] == x)
                return new int[]{nn, mm};
                //如果此时元素大于目标值，则nn--，往上寻找
            else if (mat[nn][mm] > x)
                nn--;
                //如果此时元素小于目标值，则mm++，往右寻找
            else
                mm++;
        }
        return new int[]{};
    }
}


