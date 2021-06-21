package 中等难度.容器盛水问题;

import java.util.*;


public class Solution {
    /**
     * max water
     *
     * @param arr int整型一维数组 the array
     * @return long长整型
     * 用双指针，从两边向中间靠拢，小的先走。
     * 最好的
     */
    public long maxWater(int[] arr) {
        // write code
        long res = 0;
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] <= arr[right]) {

                if (arr[left] > arr[left + 1]) {
                    int tmp = left;
                    while (arr[tmp] > arr[left + 1]) {
                        res += arr[tmp] - arr[left + 1];
                        left++;
                    }
                } else {
                    left++;
                }

            } else {
                if (arr[right] > arr[right - 1]) {
                    int tmp = right;
                    while (arr[tmp] > arr[right - 1]) {
                        res += arr[tmp] - arr[right - 1];
                        right--;
                    }
                } else {
                    right--;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxWater(new int[]{1000000000,1,1,1,1,1,1,1,1,1,1,1,1,2}));

    }
}