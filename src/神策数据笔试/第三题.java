package 神策数据笔试;

import java.util.Scanner;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.19 13:23
 * @Version: 1.0
 */
public class 第三题 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextInt();
        while (num >= 2) {
            num /= 2;
        }
        if (num == 1.0)
        {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
