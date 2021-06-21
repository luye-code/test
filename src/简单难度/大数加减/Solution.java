package 简单难度.大数加减;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.15 23:07
 * @Version: 1.0
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算两个数之和
     *
     * @param s string字符串 表示第一个整数
     * @param t string字符串 表示第二个整数
     * @return string字符串
     */
    public static String solve(String s, String t) {
        if (s.length() < t.length()) {
            String tmp = s;
            s = t;
            t = tmp;
        }
        String tmp = "";
        for (int i = 0; i < s.length() - t.length(); i++) {
            tmp += "0";
        }
        //先进行补0补齐
        t = tmp + t;
        StringBuffer sb1 = new StringBuffer(s);
        StringBuffer sb2 = new StringBuffer(t);
//        sb1.reverse();
//        sb2.reverse();
        //然后从个位向上加
        int carry = 0;
        String v = "";
        for (int i = sb1.length(); i >= 0; i--) {
            int peace = ((int) sb1.charAt(i)) + ((int) sb2.charAt(i)) - 2 * (int) ('0') + carry;
            carry = peace / 10;
            v = String.valueOf(peace % 10);
            sb1.setCharAt(i, v.charAt(0));

        }
        if (carry > 0) {
            sb1.append(carry);

        }
        sb1.reverse();
        return sb1.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("465789", "123"));
    }
}