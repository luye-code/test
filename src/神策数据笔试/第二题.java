package 神策数据笔试;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.19 13:07
 * @Version: 1.0
 */
public class 第二题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tmp = s.split(",");
        int[] num = new int[tmp.length];
        int p = 0;
        for (String s1 : tmp) {
            num[p] = Integer.parseInt(s1);
            p++;
        }
        Arrays.sort(num);
        if (num.length % 2 == 1) {
            System.out.println(num[num.length / 2]);
        }else {
            System.out.println(num[num.length / 2 - 1]);
        }

    }
}
