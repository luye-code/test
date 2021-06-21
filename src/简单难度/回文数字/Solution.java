package 简单难度.回文数字;


public class Solution {
    /**
     *
     * @param x int整型 
     * @return bool布尔型
     */
    public boolean isPalindrome (int x) {
        // write code here 用两个变量互相调用 有种动态规划的意思
        if (x < 0) return false;
        int tmp = x, y = 0;
        while (tmp!=0) {
            y = y * 10 + tmp % 10;
            tmp /= 10;
        }
        return x == y;
    }
}