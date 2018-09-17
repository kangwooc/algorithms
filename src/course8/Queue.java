package course8;

import java.util.Scanner;

public class Queue {
    static int n, m, front, rear;
    static int[] queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        queue = new int[n];
        front = 0;
        rear = -1;
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
        if (rear >= n - 1) {
            System.out.println("Overflow");
        } else {
            rear++;
            queue[rear] = X;
        }
    }

    private static void pop() {
        if (front == rear) {
            System.out.println("Underflow");
        } else {
            for (int i = 0; i < rear; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }

    private static void front() {
        if (front == rear) {
            System.out.println("NULL");
        } else {
            System.out.println(queue[front]);
        }
    }
}
