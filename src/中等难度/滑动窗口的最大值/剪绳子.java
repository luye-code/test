package 中等难度.滑动窗口的最大值;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.18 19:45
 * @Version: 1.0
 */
public class 剪绳子 {
    public int cutRope(int target) {
        return (int) (Math.pow(6,target/5)*(target%5));
    }
}
