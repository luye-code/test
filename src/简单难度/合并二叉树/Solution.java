package 简单难度.合并二叉树;

import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

//可以先把两个树层序遍历出来相加 再重新建树
public class Solution {
    /**
     * @param t1 TreeNode类
     * @param t2 TreeNode类
     * @return TreeNode类
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        // write code here
        if (Objects.isNull(t1) || Objects.isNull(t2)) {
            return Objects.isNull(t1) ? t2 : t1;
        }
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;

    }
}