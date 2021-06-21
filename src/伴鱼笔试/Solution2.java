package 伴鱼笔试;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.30 15:59
 * @Version: 1.0
 */
public class Solution2 {
    public boolean validMountainArray(int[] arr) {
        // write code here

        int idx = 0;
        while (idx < arr.length-1 && arr[idx] < arr[idx + 1]) {
            idx++;
        }
        int tmp = idx;
        while (idx != arr.length - 1 && idx != 0 && arr[idx] > arr[idx + 1]) {
            idx++;
        }
        if (idx != tmp && idx == arr.length - 1)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.validMountainArray(new int[]{5, 5, 5}));
    }
}
