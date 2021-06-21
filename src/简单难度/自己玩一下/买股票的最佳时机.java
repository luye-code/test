package 简单难度.自己玩一下;


public  class 买股票的最佳时机 {
        /**
         * @param prices int整型一维数组
         * @return int整型
         */
        public int maxProfit(int[] prices) {
            // write code here
            if (prices.length == 0 || prices.length == 1) {
                return 0;
            }

            int[] arr = new int[prices.length];
            int tmp = prices[0];
            int tmp2 = 0;
            arr[0] = prices[0];

            if (prices[0] > prices[1]) {
                arr[0] = 0;
            }

            for (int i = 1; i < prices.length; i++) {
                tmp = Math.min(tmp, prices[i]);
                if (prices[i] <= prices[i - 1]) {
                    tmp2++;
                }
                arr[i] = Math.max(arr[i - 1], prices[i] - tmp);
            }
            if (tmp2 == prices.length-1) {
                return 0;
            }
            return arr[arr.length - 1];
        }

//        public static void main(String[] args) {
//            int[] arr = new int[]{1,4,2};
//            System.out.println(maxProfit(new int[]{1,2}));
//        }

    }
