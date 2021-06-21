package 简单难度.二叉树中是否存在节点和为指定值的路径;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}


public class Solution {
    /**
     * @param root TreeNode类
     * @param sum  int整型
     * @return bool布尔型
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        // write code here
        if (root == null) {
            return false;
        }
        //处理叶子节点
        if (root.left == null && root.right == null) {
            if (root.val == sum) {
                return true;
            } else {
                return false;
            }
        }


        boolean leftHas = hasPathSum(root.left, sum - root.val);
        boolean rightHas = hasPathSum(root.right, sum - root.val);
        boolean cur = leftHas || rightHas;
        return cur;
    }
}