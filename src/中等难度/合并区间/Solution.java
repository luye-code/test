package 中等难度.合并区间;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        ArrayList<Interval> res = new ArrayList<>();

        if (intervals.size() == 0) {
            return res;
        }
        Collections.sort(intervals);
        res.add(intervals.get(0));

        for (int i = 1; i < intervals.size(); i++) {
            Interval tmp = intervals.get(i);
            Interval pre = res.get(res.size() - 1);
            if (tmp.start <= pre.end) {
                if (tmp.end <= pre.end) {
                    continue;
                } else {
                    res.remove(res.size() - 1);
                    res.add(new Interval(pre.start, tmp.end));
                }

            } else {
                res.add(tmp);
            }


        }
        return res;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        ArrayList<Interval> intervals = new ArrayList<>();
//        intervals.add(new Interval(10, 30));
//        intervals.add(new Interval(20, 60));
//        intervals.add(new Interval(80, 100));
//        intervals.add(new Interval(150, 180));
        intervals.add(new Interval(1,4));
        intervals.add(new Interval(0,4));

        s.merge(intervals);
    }

}

class Interval implements Comparable<Interval> {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }

    @Override
    public int compareTo(Interval o) {
        if (this.start == o.start) {
            return this.end > o.end ? 1 : -1;
        }
        return (this.start > o.start) ? 1 : -1;
    }
}
