    package 中等难度.找到字符串或者数组的最长无重复字串记得复习思路666;


/*
* 可以考虑用hashmap代替LinkedList 最好用python的切片做 :)
* */
import java.util.*;

public class Solution {
    public int maxLength (int[] arr) {
        LinkedList<Integer> list = new LinkedList<>();
        int p=0, ans=0;
        for(int i=0;i<arr.length;i++){
            if(list.contains(arr[i])){
                int j=list.indexOf(arr[i]);
                while (j-->=0){
                    list.removeFirst();
                }
            }
            list.add(arr[i]);
            ans=Math.max(ans,list.size());
        }
        return ans;
    }
}