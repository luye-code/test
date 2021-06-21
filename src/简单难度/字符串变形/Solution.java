package 简单难度.字符串变形;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.17 1:12
 * @Version: 1.0
 */

class Transform {
    public String trans(String s, int n) {
        String res = "";
        String tempStr = "";
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                tempStr += Character.toUpperCase(c);
            else if (c >= 'A' && c <= 'Z')
                tempStr += Character.toLowerCase(c);
            else {
                tempStr = c + tempStr;
                res = tempStr + res;
                tempStr = "";
            }
        }

        res = tempStr + res;

        return res;
    }
}

public class Solution {
    public static void main(String[] args) {
        Transform transform = new Transform();

        System.out.println(transform.trans("This is a sample ", 17));
    }
}