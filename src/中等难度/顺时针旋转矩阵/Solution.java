package 中等难度.顺时针旋转矩阵;

import java.util.*;

public class Solution {
    public int[][] rotateMatrix(int[][] mat, int n) {
        // write code here
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                swap(mat, i, j, j, i);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n/2; j++) {
                swap(mat, i, n - 1 - j, i, j);
            }
        }
        return mat;
    }

    public void swap(int[][] arr, int a, int b, int c, int d) {
        int i = arr[a][b];
        int j = arr[c][d];
        arr[a][b] = j;
        arr[c][d] = i;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] ints = s.rotateMatrix(arr, 4);
    }
}