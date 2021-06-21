package 简单难度.三个数的最大乘积;

import java.util.*;

public class Solution {
    public long solve (int[] A) {
        Arrays.sort(A);
        return Math.max((long)A[0]*A[1]*A[A.length-1],(long)A[A.length-3]*A[A.length-2]*A[A.length-1]);
    }
}