package 简单难度.合并两个有序数组;

public class Solution {
    public static void merge(int A[], int m, int B[], int n) {
        m--;
        n--;
        // 1 3 4 5 6 7 8   7 8 8 9 10  11
        // 2 3 5 8 9 10 11
        while (m >= 0 && n >= 0) {
            if (B[n] >= A[m]) {
                A[n + m + 1] = B[n--];
            } else {
                A[n + m + 1] = A[m--];

            }
        }
        while (n >= 0) {
            A[n + m + 1] = B[n--];
        }

        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

    }

    public static void main(String[] args) {
        merge(new int[]{1, 3, 4, 5, 6, 7, 8, 0, 0, 0, 0, 0, 0, 0}, 7, new int[]{2, 3, 5, 8, 9, 10, 11}, 7);
//        merge(new int[]{1, 0}, 1, new int[]{2}, 1);
    }
}