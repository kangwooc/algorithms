import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// mainly bfs problems

public class infectious {
    static int N, K, count = 0;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visited = new boolean[N + 1];
        infectious();
        System.out.println(N - count);
        sc.close();
    }

    private static void infectious() {
        Queue<Integer> q = new LinkedList<>();
        q.add(K);
        visited[K] = true;
        count++;
        while (!q.isEmpty()) {
            int element = q.remove();
            if (element / 3 != 0 && !visited[element / 3]) {
                visited[element / 3] = true;
                q.add(element / 3);
                count++;
            }
            if (element * 2 <= N && !visited[element * 2]) {
                visited[element * 2] = true;
                q.add(element * 2);
                count++;
            }
        }
    }
}
