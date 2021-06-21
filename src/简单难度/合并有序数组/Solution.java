package 简单难度.合并有序数组;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.11.25 19:33
 * @Version: 1.0
 * 题目描述
 * 给出两个有序的整数数组 和 ，请将数组 合并到数组 中，变成一个有序的数组
 * 注意：
 * 可以假设 数组有足够的空间存放 数组的元素， 和 中初始的元素数目分别为 和
 */
public class Solution {
    public void merge(int A[], int m, int B[], int n) {

        int aPtr = m - 1, bPtr = n - 1;
//  两数组元素从右至左比较，大的去 A 尾部，直至有一方指针到头为止
        for (int ptr = m + n - 1; aPtr >= 0 && bPtr >= 0; ptr--) {
            A[ptr] = A[aPtr] > B[bPtr] ? A[aPtr--] : B[bPtr--];
        }
//  A 指针先走完的情况，B 中剩余元素直接copy至 A 对应位置即可；
        while (bPtr >= 0) {
            A[bPtr] = B[bPtr--];
        }

    }
}
