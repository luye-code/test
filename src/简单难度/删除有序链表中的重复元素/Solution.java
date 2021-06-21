package 简单难度.删除有序链表中的重复元素;

import java.util.*;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    /**
     * @param head ListNode类
     * @return ListNode类
     */
    public ListNode deleteDuplicates(ListNode head) {
        // write code here
        if (Objects.isNull(head))
        {
            return head;
        }
        ListNode dummy = head;
        ListNode next = head.next;
        while (Objects.nonNull(head) && Objects.nonNull(next)) {
            if (head.val == next.val) {
                head.next = next.next;
                next = head.next;
                continue;
            }
            head = head.next;


        }
        return dummy;
    }
}