package 中等难度.单项链表的选择排序;

import java.util.Objects;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2021.4.19 23:04
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


    public static ListNode sortInList(ListNode node) {
        ListNode dummy = node;
        while (Objects.nonNull(node)) {
            ListNode tmp = node;
            ListNode tmp2 = node;
            ListNode nxt = node.next;
            if (Objects.isNull(nxt)) {
                break;
            }
            int v = nxt.val;
            while (Objects.nonNull(nxt.next)) {
                if (nxt.next.val < v) {
                    v = nxt.next.val;
                    tmp = nxt;
                }
                nxt = nxt.next;
            }
            ListNode aa = tmp.next;
            tmp.next = tmp.next.next;
            aa.next = tmp2.next;
            tmp2.next = aa;
            node = node.next;

        }
        return dummy;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-406609, 724427, -1577889, -132713, 720732, -39078, -348926, -693458, 559374, 114739, -748249, 428207, -767407, 401563, 646432, -682870, 483610, -608888, 94840, 749542, 359115, 131739, 935294, 347325, 80573, -869091, -757897, -860166, -227942, -484068, -170790, -362441, -860466, 819197, 817675, 886101, 463504, -100482, 496406, -860791};
        ListNode root = new ListNode(-426572);
        ListNode dummy = root;
        for (int i = 0; i < arr.length; i++) {
            dummy.next = new ListNode(arr[i]);
            dummy = dummy.next;
        }
        sortInList(root);
        while (Objects.nonNull(root)) {
            System.out.println(root.val);
            root = root.next;
        }
    }
}
