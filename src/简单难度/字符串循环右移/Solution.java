package 简单难度.字符串循环右移;

import java.util.*;


public class Solution {
    /**
     * 位移后二进制串的十进制值
     *
     * @param str string字符串 二进制字符串
     * @param k   int整型 循环位移次数
     * @return long长整型
     */
    public static long rotateRight(String str, int k) {
        // write code here
        StringBuilder sb = new StringBuilder(str.substring(str.length() - k));
        sb.append(str.substring(0, str.length() - k));
//        System.out.println(sb);
        return Long.parseLong(sb.toString(), 2);
    }

    public static void main(String[] args) {
        System.out.println(rotateRight("1111000110100101110110111000011110111111011001100101",45));
    }
}