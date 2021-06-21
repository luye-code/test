package 简单难度.对称二叉树之好题目;

import java.util.*;


class TreeNode {
    int val = 0;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode left = null;
    TreeNode right = null;
}

//1.对root的left 和right 进行任意方式遍历 查看是否一样
class Solution {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
//        treeNode.left.left = new TreeNode(3);
//        treeNode.left.right = new TreeNode(4);
//        treeNode.right.left = new TreeNode(4);
//        treeNode.right.right = new TreeNode(3);
        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        // write code here

        if (Objects.isNull(root)) {
            return true;
        }
        List<TreeNode> leftList = new ArrayList<>();
        List<TreeNode> rightList = new ArrayList<>();
        leftList.add(root.left);
        rightList.add(root.right);

        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            TreeNode l = leftList.get(0);
            TreeNode r = rightList.get(0);
            if (l == r) {
                leftList.remove(0);
                rightList.remove(0);
                continue;
            } else if (Objects.isNull(l) || Objects.isNull(r)) {
                return false;
            } else if (l.val != r.val) {
                return false;
            }

            leftList.remove(0);
            rightList.remove(0);
            leftList.add(l.right);
            leftList.add(l.left);
            rightList.add(r.left);
            rightList.add(r.right);

        }
        try { //处理一下边界条件
            if (leftList.get(0) != rightList.get(0)) {
                return false;
            }
        } catch (IndexOutOfBoundsException e) {
            return true;
        }

        return true;
    }
}