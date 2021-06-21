package 简单难度.自己玩一下;

import java.util.Scanner;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.10.29 19:58
 * @Version: 1.0
 */
public class 达达之路3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(compute(in.next()));
    }

    public static String compute(String num) {
        if (num.length() == 1) {
            return num;
        }
        char[] chars = num.toCharArray();
        Integer tmp = 0;
        for (int i = 0; i < chars.length; i++) {
            tmp += Integer.parseInt(String.valueOf(chars[i]));
        }
        return compute(String.valueOf(tmp));

    }
}
