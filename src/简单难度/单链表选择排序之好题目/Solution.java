package 简单难度.单链表选择排序之好题目;

import java.util.Objects;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.11.25 20:32
 * @Version: 1.0
 */

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{-406609, 724427, -157789, -132713, 720732, -39078, -348926, -693458, 559374, 114739, -748249, 428207, -767407, 401563, 646432, -682870, 483610, -608888, 94840, 749542, 359115, 131739, 935294, 347325, 80573, -869091, -757897, -860166, -227942, -484068, -170790, -362441, -860466, 819197, 817675, 886101, 463504, -100482, 496406, -860791};
        ListNode root = new ListNode(-426572);
        ListNode dummy = root;
        for (int i = 0; i < arr.length; i++) {
//            System.out.println(dummy.val);
            dummy.next = new ListNode(arr[i]);
            dummy = dummy.next;
        }
        sortInList(root);
        while (Objects.nonNull(root)) {
            System.out.println(root.val);
            root = root.next;
        }
    }

    public static ListNode sortInList(ListNode head) {
        // write code here
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;

        while (Objects.nonNull(pre.next)) {
            ListNode cur = pre.next;
            ListNode minNode = null;
            int minValue = Integer.MAX_VALUE;
            ListNode curPre = null;
            ListNode curPreSave = null;

            while (Objects.nonNull(cur)) {
                if (cur.val < minValue) {
                    minValue = cur.val;
                    minNode = cur;
                    curPreSave = curPre;
                }

                curPre = cur;
                cur = cur.next;
            }
            if (Objects.isNull(curPreSave)) {
                curPreSave = pre;
            }
            curPreSave.next = minNode.next;
            minNode.next = pre.next;
            pre.next = minNode;
            pre = pre.next;

        }
        return dummy.next;
    }
}
