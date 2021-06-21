package 简单难度.凯撒密码;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.20 10:16
 * @Version: 1.0
 */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;


public class Solution {
    /**
     * 解密密文
     *
     * @param str string字符串 密文
     * @param d   int整型 偏移量
     * @return string字符串
     */
    public static String decode(String str, int d) {
        // write code here
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < 10; i++) {
            sb.append(String.valueOf(i));
        }
        for (int i = 'A'; i < (int) 'A' + 26; i++) {
            sb.append((char) i);
        }
        for (int i = 'a'; i < (int) 'a' + 26; i++) {
            sb.append((char) i);
        }
        d = d % sb.length();
        for (int i = 0; i < chars.length; i++) {
            int idx = sb.indexOf(String.valueOf(chars[i]));
            if (idx < d) {
                chars[i] = sb.charAt(sb.length() + idx - d);
            } else {
                chars[i] = sb.charAt(idx - d);
            }
        }
        return (String.valueOf(chars));
    }

    public static void main(String[] args) {
        System.out.println(decode("123ABCabc", 3));
    }
}