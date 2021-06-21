package 简单难度.调整数组使奇数位于偶数前面;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.17 0:21
 * @Version: 1.0
 */

//如果是奇数就往前面找 找到偶数就放在他前面
//最好还是另外开一个数组 时间短
public class Solution {
    public void reOrderArray(int [] array) {
        //相对位置不变，稳定性
        //插入排序的思想
        int m = array.length;
        int k = 0;//记录已经摆好位置的奇数的个数
        for (int i = 0; i < m; i++) {
            if (array[i] % 2 == 1) {
                int j = i;
                while (j > k) {//j >= k+1
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                    j--;
                }
                k++;
            }
        }
    }
}
