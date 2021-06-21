package 简单难度.二分查找1100111;

//简单难度.二分查找 找到第一个出现的元素位置
public class Solution {

    public static void main(String[] args) {
        System.out.println(upper_bound_(5, 4, new int[]{1, 2, 4, 4, 5}));
    }

    public static int upper_bound_(int n, int v, int[] a) {
        // write code here
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (true) {
            if (low > high) {
                return n + 1;

            }
            mid = (low + high) / 2;
            if (a[mid] > v) {
                high = mid - 1;
            } else if (a[mid] < v) {
                low = mid + 1;
            } else if (a[mid] == v) {
                int t = mid;
                while (a[mid] == v) {
                    mid--;
                }
                if (t==mid)
                {
                    return mid;
                }
                return mid+1;
            }
        }
    }
}