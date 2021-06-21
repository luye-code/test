package 神策数据笔试;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.19 12:31
 * @Version: 1.0
 */
public class 第一题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] change = input.toCharArray();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < change.length; i++) {
            if (change[i] == ' ' && change[i] == sb.charAt(sb.length() - 1)) {
                continue;
            }
            sb.append(change[i]);
        }

        String[] s = sb.toString().split(" ");
        for (int i = 0; i < s.length; i++) {
            char[] tmp = s[i].toCharArray();
            for (int j = 0; j < tmp.length / 2; j++) {
                char num = tmp[j];
                tmp[j] = tmp[tmp.length - 1 - j];
                tmp[tmp.length - 1 - j] = num;
            }
            s[i] = String.valueOf(tmp);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length; i++) {
            stringBuilder.append(s[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.println(stringBuilder);
    }
}
