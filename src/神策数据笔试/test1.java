package 神策数据笔试;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.29 16:16
 * @Version: 1.0
 */
public class test1 {
    public static void main(String[] args) {

        findMaxLen(new int[]{3, 10, 2, 4, 5, 9, 2});
        findMaxLen(new int[]{3, 10, 2, 4, 2, 6, 9, 10, 11});
    }

    public static int findMaxLen(int[] arr) {
        // 1 5 3 4 5 6 8 9
        int maxLen = 0;
        int tmpLen = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                maxLen = Math.max(maxLen, tmpLen);
                tmpLen = 1;
            } else {
                tmpLen += 1;
            }
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            maxLen = Math.max(tmpLen, maxLen);
        }
        System.out.println(maxLen);
        return maxLen;


    }
}
