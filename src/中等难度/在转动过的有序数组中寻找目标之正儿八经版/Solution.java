package 中等难度.在转动过的有序数组中寻找目标之正儿八经版;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.22 15:46
 * @Version: 1.0
 */
public class Solution {
    public int search(int[] A, int target) {
        if (A == null) return -1;
        int left = 0;
        int right = A.length - 1;
        //不存在重复
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (A[mid] == target) return mid;
            else if (A[mid] < A[right]) {
                if (target > A[mid] && target <= A[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (target >= A[left] && target < A[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return -1;
    }
}
