package 简单难度.未排序数组中累加和为给定值的最长子数组长度;

import java.util.HashMap;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.17 1:48
 * @Version: 1.0
 */
public class Solution {
    /**
     * max length of the subarray sum = k
     *
     * @param arr int整型一维数组 the array
     * @param k   int整型 target
     * @return int整型
     */
    /**
     * 给定一个无序数组arr, 其中元素可正、可负、可0。给定一个整数k，求arr所有子数组中累加和为k的最长子数组长度
     */
    public int maxlenEqualK(int[] arr, int k) {
        // write code here
        int sumLen = 0;
        int maxl = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            sumLen += arr[i];
            if (!map.keySet().contains(sumLen - k)) {
                map.put(sumLen, i);
            } else if (!map.containsKey(sumLen)) {
                maxl = Math.max(i - map.get(sumLen - k), maxl);
            }
        }
        return maxl;
    }

    /**
     * 求一段无序数组中整数和负数数量相同的最长子数组，把正数换为1，负数换为-1，求和为0
     */
    public int maxlenEqualK2(int[] arr, int k) {
        // write code here
        k = 0;
        int sumLen = 0;
        int maxl = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.compare(arr[i], 0);
            sumLen += arr[i];
            if (!map.keySet().contains(sumLen - k)) {
                map.put(sumLen, i);
            } else if (!map.containsKey(sumLen)) {
                maxl = Math.max(i - map.get(sumLen - k), maxl);
            }
        }
        return maxl;
    }

    /**
     * 数组中有1和0，求子数组中0和1数量相同的。把0换成-1 求和为0的
     */
    public int maxlenEqualK3(int[] arr, int k) {
        // write code here
        k = 0;
        int sumLen = 0;
        int maxl = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? -1 : arr[i];
            sumLen += arr[i];
            if (!map.keySet().contains(sumLen - k)) {
                map.put(sumLen, i);
            } else if (!map.containsKey(sumLen)) {
                maxl = Math.max(i - map.get(sumLen - k), maxl);
            }
        }
        return maxl;
    }
}
