import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// Shortest Path
// 1. single-source : dijkstra algorithm
// 2. single-destination
// 3. single-pair
// 4. All-pairs: 플로이드 알고리즘
// http://new93helloworld.tistory.com/217
// https://ratsgo.github.io/data%20structure&algorithm/2017/11/25/shortestpath/
// http://victorydntmd.tistory.com/98?category=686701 - MST
public class findMaze {
    static int N, M, count;
    static int[][] maze, distance;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];
        distance = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        findShortestPath(maze[N - 1][0], maze[0][M - 1]);
    }
    // bfs?
    private static void findShortestPath(int start, int end) {

    }
}
