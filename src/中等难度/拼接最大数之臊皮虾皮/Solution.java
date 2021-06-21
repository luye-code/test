package 中等难度.拼接最大数之臊皮虾皮;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.26 10:29
 * @Version: 1.0
 * <p>
 * 用冒泡 相邻两个作比较 最后排出来的顺序就是我们的
 */

import java.util.*;


public class Solution {
    /**
     * 最大数
     *
     * @param nums int整型一维数组
     * @return string字符串
     */
    public static String solve(int[] nums) {
        // write code here
        System.out.println("405".compareTo("41"));
        String[] strings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strings[i] = String.valueOf(nums[i]);
        }
        for (int i = 0; i < strings.length; i++) {
            for (int j = i; j < strings.length; j++) {
                if ((strings[i] + strings[j]).compareTo(strings[j] + strings[i]) < 0) {
                    String t = strings[i];
                    strings[i] = strings[j];
                    strings[j] = t;
                }

            }
        }
        if (strings[0].equals("0")) {
            return "0";
        }
        return String.join("", strings);
    }

    public static void main(String[] args) {
        solve(new int[]{5, 4, 40, 401, 41, 411});
        System.out.println("abc".compareTo("ab"));
    }
}