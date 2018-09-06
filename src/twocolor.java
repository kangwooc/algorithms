import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// greedy algorithm
// NP-Complete problem..
// Basic Greedy Coloring Algorithm:
//
//        1. Color first vertex with first color.
//        2. Do following for remaining V-1 vertices.
//          a) Consider the currently picked vertex and color it with the
//          lowest numbered color that has not been used on any previously
//          colored vertices adjacent to it. If all previously used colors
//          appear on vertices adjacent to v, assign a new color to it.

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
    // bfs
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
                }
            }
        }
        return true;
    }

}
