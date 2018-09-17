package course8;

import java.util.Scanner;

public class Stack {
    static int[] arr;
    static int index = -1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[size];
        for (int i = 0; i < m; i++) {
            int n1 = sc.nextInt();
            if (n1 == 1) {
                int n2 = sc.nextInt();
                push(n2);
            } else if (n1 == 2) {
                pop();
            } else if (n1 == 3) {
                top();
            }
        }
        sc.close();
    }

    private static void push(int i) {
        if (index >= arr.length - 1) {
            System.out.println("Overflow");
            return;
        } else {
            arr[++index] = i;
        }
    }

    private static void pop() {
        if (index == -1) {
            System.out.println("Underflow");
            return;
        } else {
            index--;
            return;
        }
    }

    private static void top() {
        if (index == -1) {
            System.out.println("NULL");
            return;
        } else {
            System.out.println(arr[index]);
        }
    }
}
