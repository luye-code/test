package 简单难度.合并排序链表;

import java.util.Objects;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public static void main(String[] args) {

    }
    public ListNode Merge(ListNode list1, ListNode list2) {

        ListNode root = new ListNode(-1);
        ListNode dummy = root;
        try {

        while (true) {
            if (list1.val <= list2.val)
            {
                root.next = list1;
                root = root.next;
                list1 = list1.next;
            }
            else {
                root.next = list2;
                root = root.next;
                list2 = list2.next;
            }
        }
        } catch (NullPointerException e) {
            if (Objects.nonNull(list1))
            {
                root.next = list1;
            }else {
                root.next = list2;
            }
        }

        return dummy.next;
    }
}