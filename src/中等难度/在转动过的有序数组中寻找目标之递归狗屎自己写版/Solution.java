package 中等难度.在转动过的有序数组中寻找目标之递归狗屎自己写版;

/*
 * 先判断处在哪个区间，然后比较mid和边界的值
 * 想象以下两种情况:
 * ---->-->
 * -->---->
 * 特殊案例 10111
 *
 * 本代码写的跟狗屎一样
 * */


public class Solution {
    /**
     * @param A      int整型一维数组
     * @param target int整型
     * @return int整型
     */
    public int search(int[] A, int target) {
        // write code here
        return degree(A, target, 0, A.length - 1);
    }

    public int degree(int[] A, int target, int l, int r) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (A[mid] == target) {
            return mid;
        } else if ((A[mid] == A[l] && A[mid] == A[r]) || A.length == 2) {
            return degree(A, target, l + 1, r);
        } else if ((A[mid] >= A[r] && (target < A[mid]) && target >= A[l]) || //最后的>=值得回味
                (A[mid] < A[r] && (!((target > A[mid]) && target < A[r])))) {
            return degree(A, target, l, mid - 1);

        } else {
            return degree(A, target, mid + 1, r);
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(solution.search(new int[]{4, 6, 6, 8, 9, 0, 1, 2}, 1));
//        System.out.println(solution.search(new int[]{228, 234, 235, 236, 238, 239, 240, 241, 242, 243, 245, 248,
//                250, 253, 256, 257, 258, 260, 261, 262, 263, 264, 266, 268, 271, 272, 275, 276, 279, 280, 281,
//                282, 283, 284, 285, 287, 289, 291, 294, 295, 1, 6, 7, 8, 9, 10, 11, 13, 14, 15, 17, 18, 19, 20,
//                21, 22, 23, 25, 28, 30, 31, 36, 41, 43, 46, 48, 51, 52, 53, 54, 58, 59, 60, 62, 64, 66, 68, 72, 73,
//                77, 85, 86, 89, 92, 94, 95, 97, 98, 101, 105, 108, 112, 116, 118, 120, 121, 122, 124, 125, 127, 128,
//                129, 130, 131, 132, 135, 137, 139, 140, 142, 145, 147, 149, 152, 154, 156, 157, 158, 159, 168, 169, 170,
//                171, 172, 176, 178, 182, 185, 188, 190, 195, 200, 201, 202, 203, 204, 206, 208, 210, 212, 216, 219, 224, 226}, 266));
//    }
        System.out.println(solution.search(new int[]{1,2,3,4,5,6,0}, 0));
    }
}