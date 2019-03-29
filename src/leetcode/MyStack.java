package leetcode;

import java.util.*;

public class MyStack {
    Queue<Integer> q;
    int size;
    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<>();
        this.size = 0;
    }

    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
        size++;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size - 1; i++) {
            list.add(q.remove());
        }
        int val = q.remove();
        for (int num : list) {
            q.add(num);
        }
        this.size--;
        return val;
    }

    /** Get the top element. */
    public int top() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(q.remove());
        }

        for (int num : list) {
            q.add(num);
        }
        return list.get(size - 1);
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.size() == 0;
    }
}