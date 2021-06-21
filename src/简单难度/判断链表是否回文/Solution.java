package 简单难度.判断链表是否回文;

import java.util.*;


class ListNode {
    int val;
    ListNode next = null;
}


/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 */
//用一个stack存入然后挨个比对 优化：只比对一半
public class Solution {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if(head==null){
            return true;
        }
        Stack<ListNode> stack=new Stack<>();
        ListNode index=head;
        while(index!=null){
            stack.add(index);
            index=index.next;
        }
        index=head;
        while(index!=null){
            if(index.val!=stack.pop().val){
                return false;
            }
            index=index.next;
        }
        return true;
    }
}