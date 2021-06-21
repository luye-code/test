package 中等难度.数组相加合为0的三元组之双指针;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.22 15:53
 * @Version: 1.0
 * 返回满足所有条件的三元组,从左向右遍历，转换成一个数字与两数之和的变种。
 * 关键是去重手段，一个是num[i] == num[i-1]的时候去除，一个是num[left]==num[tmp[1]]的时候
 */
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {
            if (i == 0 || num[i] == num[i - 1]) {
                continue;
            }
            int left = i, right = num.length - 1;

            while (left <= right) {
                while (left < right && num[i] + num[left] + num[right] > 0) right--;
                if (num[i] + num[left] + num[right] == 0) {
                    ArrayList<Integer> integerArrayList = new ArrayList<>();
                    integerArrayList.add(num[i]);
                    integerArrayList.add(num[left]);
                    integerArrayList.add(num[right]);
                    res.add(integerArrayList);
                    while (left < right && integerArrayList.get(1).equals(num[left])) left++;

                } else {
                    left++;
                }
            }
        }
        return res;

    }
}
