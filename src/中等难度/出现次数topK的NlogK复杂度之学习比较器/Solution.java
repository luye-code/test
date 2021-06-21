package 中等难度.出现次数topK的NlogK复杂度之学习比较器;

import java.util.*;


public class Solution {
    /**
     * return topK string
     *
     * @param strings string字符串一维数组 strings
     * @param k       int整型 the k
     * @return string字符串二维数组
     * 在遍历的时候就建堆然后调整得到topK
     */
    public String[][] topKstrings(String[] strings, int k) {
        // write code here
        PriorityQueue<MyNode> queue = new PriorityQueue<>(new MyComparator());
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {
                map.put(strings[i], map.get(strings[i]) + 1);
            } else {
                map.put(strings[i], 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.add(new MyNode(entry.getKey(), entry.getValue()));
        }
        String[][] res = new String[k][2];
        for (int i = 0; i < k; i++) {
            MyNode node = queue.poll();
            res[i][0] = node.val;
            res[i][1] = String.valueOf(node.num);
        }
        return res;

    }
}

class MyNode {

    String val;
    int num;

    public MyNode(String val, int num) {
        this.val = val;
        this.num = num;
    }
}

class MyComparator implements Comparator<MyNode> {
    //    public myComparator()
//    {}
    @Override
    public int compare(MyNode o1, MyNode o2) {
        if (o1.num == o2.num) {
            return o1.val.compareTo(o2.val);
        } else {
            return o2.num - o1.num;
        }
    }
}

