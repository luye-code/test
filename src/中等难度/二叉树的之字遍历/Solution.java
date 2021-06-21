package 中等难度.二叉树的之字遍历;

import java.util.*;



public class Solution {
    /**
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList <>>
     */
    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (Objects.isNull(root))
        {
            return res;
        }
        ArrayList<TreeNode> lines = new ArrayList<>();
        lines.add(root);
        int flag = 1;
        while (lines.size() != 0) {
            ArrayList<Integer> integers = new ArrayList<>();
            ArrayList<TreeNode> tmpNodeList = new ArrayList<>();

            for (TreeNode node : lines) {
                integers.add(node.val);
                if (Objects.nonNull(node.left)) {
                    tmpNodeList.add(node.left);

                }
                if (Objects.nonNull(node.right)) {
                    tmpNodeList.add(node.right);
                }
            }

            if (flag == 1) {
                System.out.println(integers);
                res.add(integers);
            } else {
                Collections.reverse(integers);
                res.add(integers);
                System.out.println(integers);
            }
            lines.clear();
            lines = new ArrayList<>(tmpNodeList);
            Collections.copy(lines,tmpNodeList);
            tmpNodeList.clear();
            flag = 1 - flag;
        }
        return res;

    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        treeNode.left = new TreeNode(1);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.left = new TreeNode(5);
        treeNode.right.right = new TreeNode(6);
        Object a = zigzagLevelOrder(treeNode);
        int q = 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}