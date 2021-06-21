package 简单难度.杀妈层序遍历二叉树永远的痛;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.29 10:33
 * @Version: 1.0
 */

import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList <>>
     */
    public static ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList();//用于返回最后的结果
        if (root == null) return res;//如果根节点为空就返回结果
        Queue<TreeNode> q = new LinkedList<TreeNode>();//用于存储每一层的节点
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            ArrayList<Integer> temp = new ArrayList<>();//用于存储当前遍历这一层的节点
            for (int i = 0; i < n; i++) {
                TreeNode node = q.poll();//取出队列的第一个元素
                temp.add(node.val);//将队头元素保存起来
                if (node.left != null) q.add(node.left);//左孩子如果不为空就进队列
                if (node.right != null) q.add(node.right);//右孩子如果不为空就进队列
            }
            res.add(temp);//将这一层的节点数里面据保存到res
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(4);
        treeNode.right.right = new TreeNode(3);
        System.out.println(levelOrder(treeNode));
    }
}