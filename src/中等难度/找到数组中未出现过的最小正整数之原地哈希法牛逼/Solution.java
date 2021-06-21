package 中等难度.找到数组中未出现过的最小正整数之原地哈希法牛逼;


public class Solution {
    /**
     * return the min number
     *
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int minNumberdisappered(int[] arr) {
        // write code here
        int n = arr.length;
        for (int i = 0; i < n; i++) {
//            2 4 5 3 2 9 6
            while (arr[i] >= 1 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                swap(arr, arr[i] - 1, i);
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minNumberdisappered(new int[]{2,5,3,2,9,6,1});
    }
}