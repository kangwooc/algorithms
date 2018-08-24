import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// adjacency list
public class virus {
    static int count;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nV = sc.nextInt();
        int nE = sc.nextInt();

        ArrayList<ArrayList<Integer>> ad = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < nV; i++) {
            ad.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < nE; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            ad.get(t2).add(t1);
            ad.get(t1).add(t2);
        }
        boolean[] visited = new boolean[nV + 1];
        bfs(1, visited, ad);
        System.out.println(count);
        sc.close();
    }

    private static void bfs(int root, boolean[] visited, ArrayList<ArrayList<Integer>> ad) {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(root);
        visited[root] = true;
        while (!q.isEmpty()) {
            int element = q.remove();
            int i = element;
            while (i < visited.length - 1) {
                if (ad.get(element).get(i) == 1 && !visited[i]) {
                    q.add(i);
                    visited[i] = true;
                    count++;
                }
                i++;
            }
        }
    }
}
