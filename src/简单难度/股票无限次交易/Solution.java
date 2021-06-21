package 简单难度.股票无限次交易;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 计算最大收益
     *
     * @param prices int整型一维数组 股票每一天的价格
     * @return int整型
     */
    public int maxProfitOnce(int[] prices) {
        // write code here 只能交易一次
        //2,4,10,57,30,82,90,12,5,13
        //55 60 8
        int minValue = Integer.MAX_VALUE, maxSubValue = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minValue > prices[i]) {
                minValue = prices[i];
            }
            maxSubValue = Math.max(prices[i] - minValue, maxSubValue);
        }
        return maxSubValue;
    }

    public static int maxProfit(int[] prices) {
        // write code here

        int i = 0, sumValue = 0, tmp = 0;
        while (i <= prices.length - 2) {
            if (prices[i] <= prices[i + 1]) {
                tmp = i;
                while (i <= prices.length - 2 && prices[i] <= prices[i + 1]) {
                    i++;
                }
                sumValue += prices[i] - prices[tmp];
            }
            i++;
        }
        return sumValue;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{2, 4, 10, 57, 30, 82, 90, 12, 5, 13}));
    }
}