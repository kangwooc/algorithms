import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
// set the number to wall bfs...
public class findMaze3 {
    static int N, M;
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        int[][] maze = new int[N][M];
        int[][] map = new int[N][M];
        int[][] map1 = new int[N][M];
        boolean[][] visited = new boolean[N][M];
        boolean[][] visited1 = new boolean[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (maze[i][j] == 1) {
                    map[i][j] = -1;
                    map1[i][j] = -1;
                } else {
                    map[i][j] = Integer.MAX_VALUE;
                    map1[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        findShortestPath(N - 1, 0, 0, M - 1, map, visited);
        findShortestPath(0, M - 1, N - 1, 0, map1, visited1);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(map1[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }

    private static void findShortestPath(int xStart, int yStart, int xEnd, int yEnd, int[][] map, boolean[][] visited) {
        Queue<int[]> q = new LinkedList<>();
        int[] point = {xStart, yStart};
        q.add(point);
        visited[xStart][yStart] = true;
        map[xStart][yStart] = 0;
        while (!q.isEmpty()) {
            int[] element = q.remove();
            for (int i = 0; i < 4; i++) {
                int nx = element[0] + dx[i];
                int ny = element[1] + dy[i];
                if (nx == xEnd && ny == yEnd) {
                    map[nx][ny] = map[element[0]][element[1]] + 1;
                    System.out.println(map[nx][ny]);
                    return;
                }
                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (visited[nx][ny] || map[nx][ny] == -1) continue;

                map[nx][ny] = map[element[0]][element[1]] + 1;
                visited[nx][ny] = true;
                point = new int[]{nx, ny};
                q.add(point);
            }

        }
    }
}
