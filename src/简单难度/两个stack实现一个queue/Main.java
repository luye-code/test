package 简单难度.两个stack实现一个queue;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
//        queue.peek();  // returns 1

        queue.pop();   // returns 1
        queue.pop();   // returns 1
        queue.push(4);
        queue.pop();
        queue.push(5);
        queue.pop();   // returns 1
        queue.pop();
//        queue.empty(); // returns false
    }
}

class MyQueue {

    Stack<Integer> stack1 = new Stack();
    Stack<Integer> stack2 = new Stack();

    public MyQueue() {

    }

    public void push(int v) {
        stack1.add(v);
    }

    public int pop() {
        if (stack2.isEmpty()) {

            int length = stack1.size();

            for (int i = 0; i < length; i++) {
                stack2.add(stack1.pop());
            }
        }

        System.out.println(stack2.peek());
        return stack2.pop();
    }

    public int peek() {
        int length = stack1.size();

        for (int i = 0; i < length; i++) {
            stack2.add(stack1.pop());

        }
        System.out.println(stack2.peek());
        return stack2.peek();
    }

    public boolean empty() {
        System.out.println(stack2.empty());
        return stack2.empty();
    }

}
