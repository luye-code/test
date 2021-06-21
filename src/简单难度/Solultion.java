package 简单难度.旋转数组的最小值;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.17 15:44
 * @Version: 1.0
 */

class Solution {
    public int minNumberInRotateArray(int[] array) {
        int l = 0, r = array.length - 1, mid = 0;

        while (l < r) {
            if (array[l] < array[r]) {

                return array[l];
            }
            mid = l + (r - l) / 2;
//3 4 5 1 2
            if (array[mid] > array[r]) {
                l = mid;
//                continue;
            } else if (array[mid] < array[r]) {
                r = mid;
            } else {
                l--;
            }
        }
        return array[l];
    }
}