package course4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// adjacency matrix

public class bfsdfs {
    static int N;
    static int nE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        nE = sc.nextInt();
        int[][] arr = new int[N][N];
        for (int i = 0; i < nE; i++) {
            char c1 = sc.next().charAt(0);
            char c2 = sc.next().charAt(0);
            arr[c1 - 'A'][c2 - 'A'] = arr[c2 - 'A'][c1 - 'A'] = 1;
        } // setting up the graph
        boolean[] visited1 = new boolean[N];
        boolean[] visited2 = new boolean[N];
        char c = sc.next().charAt(0);
        dfs(c, arr, visited1);
        System.out.println();
        bfs(c, arr, visited2);
        sc.close();
    }

    // stack or recursion
    private static void dfs(char c, int[][] arr, boolean[] visited) {
        if (!visited[c - 'A']) {
            visited[c - 'A'] = true;
            System.out.print(c);
            for (int i = 0; i < arr[c -'A'].length; i++) {
                if (arr[c -'A'][i] == 1 && !visited[i]) {
                    dfs((char) (i + 'A'), arr, visited); // Visit node
                }
            }
        }
    }

    // queue..
    private static void bfs(char c, int[][] arr, boolean[] visited) {
        Queue q = new LinkedList();
        q.add(c - 'A');
        visited[c - 'A'] = true;
        System.out.print(c);
        while (!q.isEmpty()) {
            int element = (int) q.remove();
            int i = 0;
            while (i < N) {
                if (arr[element][i] != 0 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    System.out.print((char)(i + 'A'));
                }
                i++;
            }
        }
    }
}