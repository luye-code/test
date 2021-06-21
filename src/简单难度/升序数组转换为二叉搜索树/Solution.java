package 简单难度.升序数组转换为二叉搜索树;


class TreeNode {
    int val = 0;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode left = null;
    TreeNode right = null;
}


public class Solution {
    /**
     * @param num int整型一维数组
     * @return TreeNode类
     * 1 2 3 4 5 6 7 8 9
     */
    public TreeNode sortedArrayToBST(int[] num) {
        // write code here
        if (num == null || num.length == 0)
            return null;
        return sortedArrayToBST(num, 0, num.length - 1);

    }

    private TreeNode sortedArrayToBST(int[] nums, int l, int r) {
        if (r < l)
            return null;
        if (l == r)
            return new TreeNode(nums[l]);
        int mid = l + (r - l + 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, l, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, r);
        return root;
    }


}

class test {

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode node = solution.sortedArrayToBST(new int[]{3, 5, 8});
        System.out.println(node);
    }
}