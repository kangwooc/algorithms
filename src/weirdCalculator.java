import java.util.Scanner;

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
        int num = sc.nextInt();

        sc.close();
    }
}
