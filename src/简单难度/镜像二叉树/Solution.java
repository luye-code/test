package 简单难度.镜像二叉树;

//import javax.swing.tree.TreeNode;
//最简单 遍历
/*
* class Solution {
public:
    void Mirror(TreeNode *p) {
	if(p){
            swap(p -> left, p -> right);
            Mirror(p -> left);
            Mirror(p -> right);
        }
    }
};
* */

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution {
    public void Mirror(TreeNode root) {
        List<TreeNode> treeNodeList = new ArrayList<TreeNode>();
        List<TreeNode> treeNodes = new ArrayList<TreeNode>();
        treeNodeList.add(root);
        while (treeNodeList.size() > 0) {
            for (TreeNode node : treeNodeList) {
                TreeNode l = node.left;
                node.left = node.right;
                node.right = l;
                if (Objects.nonNull(node.left)) {
                    treeNodes.add(node.left);
                }
                if (Objects.nonNull(node.right)) {
                    treeNodes.add(node.right);
                }
            }
            treeNodeList = treeNodes;
            treeNodes = new ArrayList<>();
        }
//            return root;
    }
}