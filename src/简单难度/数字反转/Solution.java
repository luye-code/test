package 简单难度.数字反转;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.11.24 10:20
 * @Version: 1.0
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println(reverse(1));
    }

    public static int reverse(int x) {
        // write code here
        StringBuffer a = new StringBuffer(String.valueOf(x));
        boolean b = false;
        if (a.charAt(0) == '-') {
            a.deleteCharAt(0);
            b = true;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != '0') {
                a = new StringBuffer(a.substring(i));
                break;
            }
        }
        if (b) {
            a.append('-');
        }
        a.reverse();
        String tmp = a.toString();
        return Integer.parseInt(tmp);

    }
}
