package 简单难度.反转链表;

import java.util.Objects;

/**
 * @author 12532
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.11.14 11:41
 * @Version: 1.0
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (Objects.isNull(head))
        {
            return null;
        }

        ListNode next = head.next;
        head.next = null;
        ListNode tmp=null;
        while (Objects.nonNull(next))
        {
            tmp = next.next;
            next.next = head;
            head = next;
            next = tmp;
        }
        return head;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}