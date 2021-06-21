package 简单难度.自己玩一下;


public class Solution {
    /**
     * @param s string字符串
     * @return int整型
     */
    public int minFlipsMonoIncr(String s) {
        // write code here
        char[] chars = s.toCharArray();
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '1') {
                for (int j = i; j < chars.length; j++) {
                    if (chars[j] == '0') {
                        tmp1++;
                    }
                }
            }
            break;

        }
        for (char c : s.toCharArray()
        ) {
            if (c == '1') {
                tmp2++;
            }
        }
        if (tmp1 < tmp2) {
            return tmp1;
        }
        return tmp2;
    }
}