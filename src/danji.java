import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class danji {

    static int num, count = 0;
    static int[][] map;
    static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    static List<Integer> list = new ArrayList<>();
    static boolean[][] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        map = new int[num][num];
        visited = new boolean[num][num];

        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < num; j++) {
                map[i][j] = s.charAt(j) - 48;
            }
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {

            }
        }
        sc.close();
    }

    private static void go(int x, int y) {

    }
}
