import java.util.Scanner;
// adjacency matrix
public class danji {
    static int danjiCount;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] house = new int[num][num];
        boolean[][] visited = new boolean[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                char[] s = sc.next().toCharArray();
                house[i][j] = Integer.parseInt(String.valueOf(s[j]));
            }
        } // setting the graph
        bfs(house, visited);

    }

    private static void bfs(int[][] house, boolean[][] visited) {
        danjiCount++;
    }
}
