import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class quad {
    static int N;
    static int[][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();
    }

    static class QuadTreeNode {
        int data;
        ArrayList<Integer> children;
        public QuadTreeNode(int data) {
            this.data = data;
            children = new ArrayList<>();
        }
    }

    static class QuadTree {
        QuadTreeNode root;
        public QuadTree() {

        }
    }

}
