package 中等难度.整除问题;

import java.util.*;


public class Solution {
    /**
     * 寻找所有能整除 4042 的数对个数
     *
     * @param a long长整型
     * @param b long长整型
     * @param c long长整型
     * @param d long长整型
     * @return long长整型
     */
    public long findPairs(long a, long b, long c, long d) {
        // write code here
        long ac = a;

        ArrayList<long[]> longs = new ArrayList<>();
//        while (a <= b) {
//            //先拿因子
//            if (2021 % a == 0 && c <= (2021 / a) && (2021 / a) <= d) {
////                t++;
//                long[] tmp = new long[2];
//                tmp[0] = a;
//                tmp[1] = 2021 / a;
//                longs.add(tmp);
////                System.out.println(a + " " + 2021 / a);
//            }
//            a++;
//        }
        longs.add(new long[]{1,2021});
        longs.add(new long[]{43,47});
        longs.add(new long[]{47,43});
        longs.add(new long[]{2021,1});
        ArrayList<Long> sampleList = new ArrayList<>();
        long maxV = b * d;
        long f = maxV / 2021;
        long res = 0;
        for (long[] arr : longs) {
            res += (b / arr[0]) * (d / arr[1]);
            if (arr[0] == 1 || arr[1] == 1) {
                continue;
            }
            res = res - (d / arr[1] + 1 - ac) - (b / arr[0] + 1 - c) +1;
        }
        System.out.println(res-1);
        return res-1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findPairs(1000,2021,1000,2021);
    }
}