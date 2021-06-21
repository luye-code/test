package 简单难度.斐波那契数列;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.16 21:14
 * @Version: 1.0
 */
public class Solution {
    public static int Fibonacci(int n) {

        if (n==0)
        {
            return 0;
        }
        int a = 1, b = 0, tmp = 0;
        for (int i = 0; i < n - 1; i++) {
            tmp = a;
            a = a + b;
            b = tmp;

        }
        return a;
    }

    public static void main(String[] args) {
        Fibonacci(2);
    }
}
