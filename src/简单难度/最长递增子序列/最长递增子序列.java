package 简单难度.最长递增子序列;

import java.util.*;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020/9/2 23:13
 * @Version: 1.0
 */
public class 最长递增子序列 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.LIS(new int[]{2, 1, 5, 3, 6, 4, 8, 9, 7});
    }
}

class Solution {
    /**
     * retrun the longest increasing subsequence
     *
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
    private int[] arr;

    public int[] LIS(int[] arr) {
        // write code here
        List<List<Integer>> list = new ArrayList();
        List tmp = new ArrayList();
        this.arr = arr;
        list.add(new ArrayList());
//        tmp.add(0);
        this.dfs(list, tmp, arr, 0);
//        Collections.sort(list);
        System.out.println(list);
//        list.add(new ArrayList<>().);
//        list.sort(c);
        System.out.println(list);


        return new int[5];
    }

    public void dfs(List<List<Integer>> list, List tmp, int[] arr, int cnt) {
        if (cnt == arr.length) {
            if (tmp.size() >= list.get(0).size()) {
                if (tmp.size() > list.get(0).size()) {
                    list.clear();
                }
                List a = new ArrayList();
                Collections.addAll(a, new Object[tmp.size()]);
                Collections.copy(a, tmp);
                list.add(a);
                return;
            } else {
                return;
            }
        }

        for (int i = cnt; i <= arr.length - 1; i++) {
            if (tmp.size() == 0 || (int) tmp.get(tmp.size() - 1) < arr[i]) {
//                System.out.println("***");
                tmp.add(arr[i]);
                dfs(list, tmp, arr, i + 1);
                tmp.remove(tmp.size() - 1);
            } else if (i == arr.length - 1) {
                dfs(list, tmp, arr, i + 1);
            }
        }


    }
}