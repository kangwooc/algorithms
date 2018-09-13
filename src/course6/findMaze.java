import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// use bfs -> dijkstra algorithms
// https://crab.rutgers.edu/~guyk/BFS.pdf
public class findMaze {
    static int N, M;
    static int[][] maze, map;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0}, dy = {0, 0, -1, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        maze = new int[N][M];
        visited = new boolean[N][M];
        map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (maze[i][j] == 1) map[i][j] = -1;
                else map[i][j] = Integer.MAX_VALUE;
            }
        }
        findShortestPath(N - 1, 0, 0, M - 1);
        sc.close();
    }

    // bfs - simply...
    private static void findShortestPath(int x1, int y1, int x2, int y2) {
        Queue<int[]> q = new LinkedList<>();
        int[] point = {x1, y1};
        q.add(point);
        // initialize start Node
        visited[x1][y1] = true;
        map[x1][y1] = 0;

        while (!q.isEmpty()) {
            int[] elements = q.remove();
            for (int i = 0; i < 4; i++) {
                int nx = elements[0] + dx[i];
                int ny = elements[1] + dy[i];
                if (nx == x2 && ny == y2) {
                    map[nx][ny] = map[elements[0]][elements[1]] + 1;
                    System.out.println(map[nx][ny]);
                    return;
                }
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
                    continue;
                }
                if (visited[nx][ny] || maze[nx][ny] == 1) {
                    continue;
                }
                map[nx][ny] = map[elements[0]][elements[1]] + 1;
                visited[nx][ny] = true;
                point = new int[]{nx, ny};
                q.add(point);
            }
        }
    }
}
