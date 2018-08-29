package course5;

import java.util.Scanner;

public class traversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] tree = new int[num + 1][3];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 3; j++) {
                tree[i][j] = sc.nextInt();
            }
        }
        preOrder(tree, 0);
        System.out.println();
        inOrder(tree, 0);
        System.out.println();
        postOrder(tree, 0);
        sc.close();
    }
    // root -> left -> right
    private static void preOrder(int[][] tree, int root) {
        if (root != -1) {
            System.out.print(root + " ");
            preOrder(tree, tree[root][1]);
            preOrder(tree, tree[root][2]);
        }
    }
    // left -> root -> right
    private static void inOrder(int[][] tree, int root) {
        if (root != -1) {
            if (tree[root][1] != -1) inOrder(tree, tree[root][1]);
            System.out.print(root + " ");
            if (tree[root][2] != -1) inOrder(tree, tree[root][2]);
        }

    }
    // left -> right -> root
    private static void postOrder(int[][] tree, int root) {
        if (root != -1) {
            if (tree[root][1] != -1) postOrder(tree, tree[root][1]);
            if (tree[root][2] != -1) postOrder(tree, tree[root][2]);
            System.out.print(root  + " ");
        }
    }
}
