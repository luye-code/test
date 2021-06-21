package 中等难度.最近公共祖先;

import java.util.*;


public class Solution {
    /**
     * @param root TreeNode类
     * @param o1   int整型
     * @param o2   int整型
     * @return int整型
     */
        public static int lowestCommonAncestor(TreeNode root, int o1, int o2) {
        // write code here
        if (root == null) return -1;
        if (o1 == root.val || o2 == root.val) return root.val;
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left == -1) return right;
        if (right == -1) return left;
        return root.val;
    }

    //该node以及子节点是否存在对应值
    public static Boolean find(TreeNode node, int o1, int o2, ArrayList arrayList) {
        if (Objects.isNull(node)) {
            return false;
        }
        if (node.val == o1 || node.val == o2) {
            return true;
        }
        boolean l = find(node.left, o1, o2, arrayList);
        boolean r = find(node.right, o1, o2, arrayList);
        if (l && r) {
            arrayList.clear();
            arrayList.add(node.val);
        } else if (l) {
            arrayList.add(node.left.val);
        } else if (r) {
            arrayList.add(node.right.val);
        }
        return l || r;

    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(5);
        treeNode.right = new TreeNode(1);

        treeNode.left.left = new TreeNode(6);
        treeNode.left.left.left = null;
        treeNode.left.left.right = null;
        treeNode.left.right = new TreeNode(2);
        treeNode.left.right.left = new TreeNode(7);
        treeNode.left.right.right = new TreeNode(4);
        treeNode.right.left = new TreeNode(0);
        treeNode.right.right = new TreeNode(8);
        System.out.println(lowestCommonAncestor(treeNode, 3, 1));
        int a = 1;
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