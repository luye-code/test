package 伴鱼笔试;

import java.util.HashSet;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.3.30 16:47
 * @Version: 1.0
 */
public class 第二题 {
    public int NumberOfTriplets(int[] arr) {
        // write code here
        HashSet<Integer> integerHashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            integerHashSet.add(arr[i]);
        }
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (integerHashSet.contains(arr[i] + arr[j])) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        第二题 d = new 第二题();
        System.out.println(d.NumberOfTriplets(new int[]{7, 6, 5}));
    }
}
