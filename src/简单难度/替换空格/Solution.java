package 简单难度.替换空格;

public class Solution {
    public String replaceSpace(StringBuffer str) {

        String s = str.toString();
        s = s.replace(" ", "%20");
        return s;

    }
}