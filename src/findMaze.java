import java.util.Scanner;
// Shortest Path
// 1. single-source : dijkstra
// 2. single-destination
// 3. single-pair
// 4. All-pairs: 플로이드 알고리즘
// http://new93helloworld.tistory.com/217
// https://ratsgo.github.io/data%20structure&algorithm/2017/11/25/shortestpath/
public class findMaze {
    static int N, M;
    static int[][] maze;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        maze = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maze[i][j] = sc.nextInt();
            }
        }
        findShortestPath(maze[N - 1][0], maze[0][M - 1]);
    }

    private static void findShortestPath(int start, int end) {

    }
}
