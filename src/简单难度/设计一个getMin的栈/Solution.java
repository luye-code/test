package 简单难度.设计一个getMin的栈;

import java.util.*;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.12.14 22:29
 * @Version: 1.0
 */
public class Solution {
    /**
     * return a array which include all ans for op3
     *
     * @param op int整型二维数组 operator
     * @return int整型一维数组
     * 4 2 3 2 1
     */
    public static int[] getMinStack(int[][] op) {
        // write code here
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < op.length; i++) {

            switch (op[i][0]) {
                case 1:
                    stackA.add(op[i][1]);
                    if (stackB.empty()) {
                        stackB.add(op[i][1]);
                    } else {
                        if (op[i][1] <= stackB.peek()) {
                            stackB.add(op[i][1]);
                        }

                    }

                    break;
                case 2:
                    Integer tmp = stackA.pop();
                    if (tmp.equals(stackB.peek())) {
                        stackB.pop();
                    }
                    break;
                case 3:
                    result.add(stackB.peek());
                    break;


            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        getMinStack(new int[][]{{1, 3}, {1, 2}, {1, 1}, {3}, {2}, {3}});
//        getMinStack(new int[][]{{1, -185224}, {1, -515268}, {3}, {1, -57301}, {2}, {2}, {1, 539954}, {1, 886856}, {1, 333965}, {3}});
    }
}
