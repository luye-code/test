package 简单难度.自己玩一下;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

/**
 * @Description:
 * @Auther: lyuans
 * @Date: 2020.10.29 20:09
 * @Version: 1.0
 */
public class 达达之路2 {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s.replace('|', '&');
        String s1 = s.split("&")[0];
        String s2 = s.split("&")[1];
        String[] chars1 = s1.split(",");
        String[] chars2 = s2.split(",");
        int l = 0, r = 0;
        while (true) {
            if (l == chars1.length || r == chars2.length) {
                if (l == chars1.length) {
                    for (int i = r; i < chars2.length; i++) {
                        integers.add(Integer.parseInt(chars2[i]));

                    }
                } else {
                    for (int i = l; i < chars1.length; i++) {
                        integers.add(Integer.parseInt(chars1[i]));

                    }
                }
                break;
            }
            if (Integer.parseInt(chars1[l]) < Integer.parseInt(chars2[r])) {
                integers.add(Integer.parseInt(chars1[l]));
                l++;

            } else {
                integers.add(Integer.parseInt(chars2[r]));
                r++;

            }
        }
        Node node = new Node(integers.get(0));
        Node root = node;
        for (int i = 1; i < integers.size(); i++) {
            node.next = new Node(integers.get(i));
            node = node.next;
        }

        while (Objects.nonNull(root)) {
            if (Objects.isNull(root.next))
            {
                System.out.println(root.val);
                break;
            }
            System.out.print(root.val);
            root = root.next;

        }
    }
}

class Node {
    public Integer val;
    public Node next;

    public Node(Integer val) {
        this.val = val;

    }
}