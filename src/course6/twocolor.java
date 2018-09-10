package course6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class twocolor {
    static int nV;
    static int nE;
    static int[][] graph;
    static int[] vertices;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();
        graph = new int[nV][nV];
        vertices = new int[nV];
        visited = new boolean[nV];
        for (int i = 0; i < nE; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            graph[n1][n2] = graph[n2][n1] = 1;
        } // set the graph...
        int start = 0;
        if (isTwoColoring(start)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }

    // bfs - ask question!
    private static boolean isTwoColoring(int start) {
        Queue<Integer> q = new LinkedList();
        q.add(start);
        visited[start] = true;
        vertices[start] = 1;
        while (!q.isEmpty()) {
            int element = q.remove();
            int i = 0;
            while (i < nV) {
                if (graph[element][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    if (vertices[element] == 1) {
                        vertices[i] = 2;
                    } else if (vertices[element] == 2){
                        vertices[i] = 1;
                    }
                }
                i++;
            }
        }

        for (int i = 0; i < nV - 1; i++) {
            for (int j = i + 1; j < nV; j++) {
                if (graph[i][j] == 1 && (vertices[i] == vertices[j])) {
                    return false;
                }
            }
        }

        return true;
    }
}
