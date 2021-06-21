package 中等难度.链表中环的入口节点不占用额外空间;

import java.util.Objects;

/**
 * 1.用hash表存每个node最快，O(1)的时间，2O(n)的空间。缺点是耗费了额外空间。
 * 2.用快慢指针，快的两步，慢的一步，然后记录相遇位置，再走一次，一个从相遇位置走，一个从起点走，相遇的时候就是环入口，通过公式推导。
 * 3.从head往下走，让每个node的next指向自己，最终会再遇到一个node.next = node的节点 跳出循环，该node就是入口。缺点是破坏了链表结构
 * 4.快慢指针确认是否有环后，有环则从头往后遍历并删除每一个节点的next，直到遇到一个next=null的值。缺点同上
 */
public class Solution {
    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean flag = true;
        try {
            while (slow.val != fast.val || flag) {
                flag = false;
                slow = slow.next;
                fast = fast.next.next;
            }
        } catch (Exception e) {
            return null;
        }
        fast = head;
        while (slow.val != fast.val) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;


    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        System.out.println(detectCycle(head));
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}