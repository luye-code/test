package 简单难度.连续数组中的缺失数字;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.17 23:06
 * @Version: 1.0
 */


public class Solution {
    /**
     * 找缺失数字
     *
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public static  int solve(int[] a) {
        // write code here
        int l = 0, r = a.length - 1, mid = 0;
        while (l < r) {
            mid = l + (r - l) / 2;
            if (a[mid] + 2 == a[mid + 1]) {
                return a[mid] + 1;
            }

            if (a[mid] == mid) {
                l = mid + 1;
            } else if (a[mid] > mid) {
                r = mid;
            }

        }
        return a[mid + 1];

    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{0,1,2,3,4,5,7}));
    }
}