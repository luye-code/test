package 简单难度.镜像二叉树;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.16 22:15
 * @Version: 1.0
 */
public class 递归版本 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        Mirror(root.left);
        Mirror(root.right);
    }
}