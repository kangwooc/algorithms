package course8;

import java.util.Scanner;

public class CircularQueue {
    static int n, m, front, rear;
    static int[] queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        queue = new int[n];
        front = rear = 0;
        for (int i = 0; i < m; i++) {
            int n1 = sc.nextInt();
            if (n1 == 1) {
                int n2 = sc.nextInt();
                push(n2); // enqueue
            } else if (n1 == 2) {
                pop(); // dequeue
            } else if (n1 == 3) {
                front();
            }
        }

    }

    private static void push(int X) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        queue[rear] = X;
        rear = (++rear) % n;

    }

    private static void pop() {
        if (rear == front) {
            System.out.println("Underflow");
            return;
        }
        front = (++front) % n;
    }

    private static void front() {
        if (rear == front) {
            System.out.println("NULL");
            return;
        }
        System.out.println(queue[front]);
    }

    private static boolean isFull() {
        return (rear + 1) % n == front ? true : false;
    }
}
