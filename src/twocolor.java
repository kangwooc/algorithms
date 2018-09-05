import java.util.Scanner;
// greedy algorithm
public class twocolor {
    static int nV;
    static int nE;
    static int[][] graph;
    static int[] colors;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();
        graph = new int[nV][nV];
        colors = new int[nV];
        visited = new boolean[nV];
        for (int i = 0; i < nE; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            graph[n1][n2] = graph[n2][n1] = 1;
        }
        int start = 0;
        twoColoring(start);
        sc.close();
    }

    private static void twoColoring(int start) {
        if (isTwoColor(start)) {
            if (start == nV) {
                System.out.println("YES");
            } else {
                for (int color = 1; color <= 2; color++) {
                    colors[color] = color;
                    twoColoring(start + 1);
                }
            }
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isTwoColor(int start) {
        int i = 0;
        boolean Switch = true;
        while (i < start && Switch) {
            if (graph[start][i] == 1 && colors[start] == colors[i]) Switch = false;
            i++;
        }
        return Switch;
    }

}
