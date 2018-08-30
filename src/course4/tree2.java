package course4;

import java.util.Scanner;

public class tree2 {
    static char[][] ch;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ch = new char[26][3];
        for (int i = 0; i < num; i++) {
            char root = sc.next().charAt(0);
            char left = sc.next().charAt(0);
            char right = sc.next().charAt(0);

            ch[root - 'A'][0] = root;
            ch[root - 'A'][1] = left;
            ch[root - 'A'][2] = right;
        } // setting tree
        preOrder('A');
        System.out.println();
        inOrder('A');
        System.out.println();
        postOrder('A');
    }

    // root -> left -> right
    private static void preOrder(char root) {
        if (root != '.') {
            System.out.print(ch[root - 'A'][0]);
            if (ch[root - 'A'][1] != '.') preOrder(ch[root - 'A'][1]);
            if (ch[root - 'A'][2] != '.') preOrder(ch[root - 'A'][2]);
        }
    }
    // left - > root -> right
    private static void inOrder(char root) {
        if (root != '.') {
            if (ch[root - 'A'][1] != '.') inOrder(ch[root - 'A'][1]);
            System.out.print(ch[root - 'A'][0]);
            if (ch[root - 'A'][2] != '.') inOrder(ch[root - 'A'][2]);
        }
    }
    // left -> right -> root
    private static void postOrder(char root) {
        if (root != '.') {
            if (ch[root - 'A'][1] != '.') postOrder(ch[root - 'A'][1]);
            if (ch[root - 'A'][2] != '.') postOrder(ch[root - 'A'][2]);
            System.out.print(ch[root - 'A'][0]);
        }
    }
}
