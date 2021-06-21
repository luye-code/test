package 简单难度.字符串最长公共前缀;

import java.util.*;


public class Solution {
    /**
     * @param strs string字符串一维数组
     * @return string字符串
     */
    public static String longestCommonPrefix(String[] strs) {
        // write code here 排个序比第一个和最后一个
        if (strs.length == 0 || Objects.isNull(strs)) {
            return "";
        }
        Arrays.sort(strs);
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == (strs[strs.length - 1].charAt(i))) {
                sb.append(strs[0].charAt(i));
                continue;
            }
            break;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abca","abc","abca","abc","abcc"}));
    }
}