package 简单难度.判断1树中是否有2树的拓扑结构完全相同的子树;

class TreeNode {
    int val = 0;

    public TreeNode(int val) {
        this.val = val;
    }

    TreeNode left = null;
    TreeNode right = null;
}

public class Solution {

    public boolean isContains(TreeNode root1, TreeNode root2) {
        // write code here
        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder();
        preOrder(root1, builder1);
        preOrder(root2, builder2);
        if (builder1.toString().contains(builder2.toString())) {
            return true;
        } else {
            return false;
        }
    }

    //中序遍历并填充stringbuilder
    static void preOrder(TreeNode treeNode, StringBuilder stringBuilder) {
        if (treeNode == null) {
            return;
        }
        preOrder(treeNode.left, stringBuilder);
        stringBuilder.append(treeNode.val);
        preOrder(treeNode.right, stringBuilder);
    }
}