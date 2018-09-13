import java.util.*;

// dijkstra algorithm
// Shortest Path for weighted graph
// 1. single-source: dijkstra algorithm / Bellman-Ford’s algorithm
// 2. single-destination: dijkstra algorithm / Bellman-Ford’s algorithm
// 3. single-pair
// 4. All-pairs: 플로이드 알고리즘
// http://new93helloworld.tistory.com/217
// https://ratsgo.github.io/data%20structure&algorithm/2017/11/25/shortestpath/
// http://victorydntmd.tistory.com/98?category=686701 - MST

public class weirdCalculator {
    public static final int SIZE = 100000;
    static int[] arr = new int[SIZE];
    static boolean[] visited = new boolean[SIZE];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dest = sc.nextInt();
        for (int i = 0; i < SIZE; i++) {
            arr[i] = Integer.MAX_VALUE;
        }
        findShortestPath(dest);
        sc.close();
    }

    // bfs?
    private static void findShortestPath(int dest) {
        int initial = 1;
        Queue<Integer> q = new LinkedList<>();
        q.add(initial);
        arr[initial] = 0;
        while (!q.isEmpty()) {
            int element = q.remove();
            if (element >= SIZE) continue;
            if (element == dest) {
                System.out.println(arr[element]);
                return;
            }
            if (element / 3 != 0 && !visited[element / 3]) {
                visited[element / 3] = true;
                q.add(element / 3);
                arr[element / 3] = arr[element] + 1;
            }
            if (element * 2 >= SIZE) continue;
            if (element * 2 != 0 && !visited[element * 2]) {
                visited[element * 2] = true;
                q.add(element * 2);
                arr[element * 2] = arr[element] + 1;
            }
        }
    }
}
