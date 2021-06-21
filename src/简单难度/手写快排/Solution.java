package 简单难度.手写快排;

import java.util.*;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     *
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public  int[] MySort(int[] arr) {
        // write code here
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    public void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = subSort(arr, l, r);
            quickSort(arr, l, mid-1);
            quickSort(arr, mid + 1, r);
        }

    }

    public int subSort(int[] arr, int l, int r) {
        int target = arr[r];
        int left = l;
        int right = r - 1;
        while (left <= right) {
            if (arr[right] < target && arr[left] >= target) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            } else if (arr[right] < target) {
                left++;
            } else if (arr[left] >= target) {
                right--;
            }else {
                left++;
                right--;
            }

        }
        arr[r] = arr[left];
        arr[left] = target;
        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.MySort(new int[]{});
    }
}