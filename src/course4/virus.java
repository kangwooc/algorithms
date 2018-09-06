package course4;

import java.util.*;

// adjacency list
public class virus {
    static int count;
    static int countdfs;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nV = sc.nextInt();
        int nE = sc.nextInt();

        ArrayList<ArrayList<Integer>> ad = new ArrayList<>();
        for (int i = 0; i <= nV; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            ad.add(list);
        }

        for (int i = 0; i < nE; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            ad.get(t2).add(t1);
            ad.get(t1).add(t2);
        }

        boolean[] visited = new boolean[nV + 1];
        boolean[] visited1 = new boolean[nV + 1];
        bfs(1, visited, ad);
        System.out.println(count);
        dfs(1, visited1, ad);
        System.out.println(countdfs);
        sc.close();
    }

    // bfs in adjacency list...
    private static void bfs(int root, boolean[] visited, ArrayList<ArrayList<Integer>> ad) {
        Queue<Integer> q = new LinkedList<>(); // queue
        q.add(root);
        visited[root] = true;
        while (!q.isEmpty()) {
            int element = q.remove();
            Iterator<Integer> it = ad.get(element).iterator();
            while (it.hasNext()) {
                int n = it.next();
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                    count++;
                }
            }
        }
    }

    private static void dfs(int root, boolean[] visited, ArrayList<ArrayList<Integer>> ad) {
        if (!visited[root]) {
            visited[root] = true;
            countdfs++;
            for (int i = 0; i < ad.get(root).size(); i++) {
                if (!visited[ad.get(root).get(i)]) {
                    dfs(ad.get(root).get(i), visited, ad);
                }
            }
        }
    }
}
