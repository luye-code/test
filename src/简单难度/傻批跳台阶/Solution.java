package 简单难度.傻批跳台阶;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.16 21:42
 * @Version: 1.0
 */
public class Solution {
    public static int JumpFloor(int target) {
        if (target == 1) {
            return 1;

        }
        if (target == 2) {
            return 2;
        }
        return JumpFloor(target - 1) + JumpFloor(target - 2);
    }
}