package 中等难度.滑动窗口的最大值;

import java.util.*;

public class Solution {
    public static ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> queue = new ArrayList<>();
        for (int i = 0; i < num.length; i++) {

            if (queue.size() > 0 && queue.get(0) + size < i +1) {
                queue.remove(0);
            }
            while (queue.size() > 0 && num[queue.get(queue.size() - 1)] < num[i]) {
                queue.remove(queue.size() - 1);

            }
            queue.add(i);
            if (i >= size - 1) {
                res.add(num[queue.get(0)]);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxInWindows(new int[]{2,3,4,2,6,2,5,1},3));
//        [4,4,6,6,5,5]
    }
}