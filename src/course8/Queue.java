package course8;
// 문제점
// 1) 큐가 가득찼다.
//  - 더이상 데이터를 넣을 수 없다. 공간의 제한이 생김.
// 2) 가득 찬 건 아니지만 rear이 마지막 인덱스를 가리키고 있으며, 앞의 공간이 비어있다.
//  - 데이터를 넣을 공간을 마련하기 위해 데이터를 전체적으로 앞으로 이동시켜야한다. 비효율적인 작업이 생김.
import java.util.Scanner;
// http://mailmail.tistory.com/33

public class Queue {
    static int n, m, front, rear;
    static int[] queue;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        queue = new int[n];
        front = rear = -1;
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
            queue[++rear] = X;
        }
    }

    private static void pop() {
        if (front == rear) {
            System.out.println("Underflow");
        } else {
            front++;
        }
    }

    private static void front() {
        if (front == rear) {
            System.out.println("NULL");
        } else {
            System.out.println(queue[front + 1]);
        }
    }
}
