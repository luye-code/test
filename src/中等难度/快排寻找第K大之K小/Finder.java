package 中等难度.快排寻找第K大之K小;

/*
 * 用快排的思想，返回的mid大于K 则在左边寻找，小于则在右边寻找 第K大和第K小同理 K大就等于N-K小
 * */
public class Finder {
    public int findKth(int[] a, int n, int K) {
        // write code here
        quickSort(a, 0, n - 1, K - 1);
        return -1;
    }

    public int quickSort(int[] arr, int l, int r, int K) {
        if (l <= r) {
            int mid = subSort(arr, l, r);
            if (mid == K) {
                return arr[mid];
            } else if (mid < K) {
                return quickSort(arr, mid + 1, r, K);

            } else {
                return quickSort(arr, l, mid - 1, K);
            }
        }
        return -1;

    }

    public int subSort(int[] arr, int l, int r) {
        int target = arr[r];
        int left = l;
        int right = r - 1;
        while (left <= right) {
            if (arr[right] < target && arr[left] >= target) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                left++;
                right--;
            } else if (arr[right] < target) {
                left++;
            } else if (arr[left] >= target) {
                right--;
            } else {
                left++;
                right--;
            }

        }
        arr[r] = arr[left];
        arr[left] = target;
        return left;
    }

    public static void main(String[] args) {
        Finder finder = new Finder();
        System.out.println(finder.findKth(new int[]{1332802, 1177178, 1514891, 871248, 753214, 123866, 1615405, 328656, 1540395, 968891,
                1884022, 252932, 1034406, 1455178, 821713, 486232, 860175, 1896237, 852300, 566715, 1285209, 1845742, 883142, 259266, 520911,
                1844960, 218188, 1528217, 332380, 261485, 1111670, 16920, 1249664, 1199799, 1959818, 1546744, 1904944,
                51047, 1176397, 190970, 48715, 349690, 673887, 1648782, 1010556, 1165786, 937247, 986578, 798663
        }, 49, 25));
//        System.out.println(finder.findKth(new int[]{5,1,2,3,4,8},6,5));
        int k = 1;
    }
}