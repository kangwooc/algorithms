package course8;

import java.util.Scanner;
// 원형 큐
public class CircularQueue {
    static int size, m, front, rear;
    static int[] queue;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        m = sc.nextInt();
        queue = new int[size + 1];
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
        sc.close();
    }

    private static void push(int X) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            rear = (rear + 1) % (size + 1);
            queue[rear] = X;
        }
    }

    private static int pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return -1;
        }
        int preIndex = front;
        front = (++front) % (size + 1);
        return queue[preIndex];
    }

    private static void front() {
        if (isEmpty()) {
            System.out.println("NULL");
        } else {
            System.out.println(queue[(front + 1) % (size + 1)]);
        }
    }

    private static boolean isFull() {
        return (rear + 1) % (size + 1) == front;
    }
    private static boolean isEmpty() {
        return front == rear;
    }
}
