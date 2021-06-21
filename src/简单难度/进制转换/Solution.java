package 简单难度.进制转换;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.11.24 10:04
 * @Version: 1.0
 */
public class Solution {
    public static final String[] F = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

    public static String solve(int M, int N) {
        // write code here
        String t = "";
        if (M < 0) {
            t = "-";
            M = -M;

        }
        StringBuffer sb = new StringBuffer();
        int temp = -1;
        while (M != 0) {
            temp = M % N;
            sb.append(F[temp]);
            M = M / N;
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(t);

        sb.reverse();

        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(solve(-100000000,16));
    }
}
