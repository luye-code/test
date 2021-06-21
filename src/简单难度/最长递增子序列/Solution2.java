package 简单难度.最长递增子序列;


public class Solution2 {
    /**
     * retrun the longest increasing subsequence
     *
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
    public static int[] LIS(int[] arr) {
        // write code here
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1]) {
                res[i] = res[i - 1] + 1;
            }
        }
        int max = 0;
        int idx = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] > max) {
                max = res[i];
                idx = i - max + 1;
            }
        }
        for (int i = idx; i < idx + max; i++) {
            System.out.println(arr[i]);
        }
        return new int[5];
    }

    public static void main(String[] args) {
        LIS(new int[]{2,1,5,3,6,4,8,9,7});
    }
}