import java.util.*;

public class bfsdfs2 {
    static int nV;
    static int nE;
    static ArrayList<ArrayList<Integer>> adlist;
    static boolean[] bfsVisited;
    static boolean[] dfsVisited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();
        adlist = new ArrayList<>();
        for (int i = 0; i < nV; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            adlist.add(list);
        }

        for (int i = 0; i < nE; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            adlist.get(n1).add(n2);
            adlist.get(n2).add(n1);
        }
        bfsVisited = new boolean[nV];
        dfsVisited = new boolean[nV];
        dfs(0, dfsVisited);
        System.out.println();
        bfs(0, bfsVisited);
    }

    private static void dfs(int root, boolean[] visited) {
        if (!visited[root]) {
            visited[root] = true;
            System.out.print(root + " ");
            for (int i = 0; i < adlist.get(root).size(); i++) {
                if (!visited[adlist.get(root).get(i)]) {
                    dfs(adlist.get(root).get(i), visited);
                }
            }
        }
    }

    private static void bfs(int root, boolean[] visited) {
        Queue q = new LinkedList();
        q.add(root);
        visited[root] = true;
        System.out.print(root + " ");
        while (!q.isEmpty()) {
            int element = (int) q.remove();
            Iterator it = adlist.get(element).iterator();
            while (it.hasNext()) {
                int i = (int) it.next();
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    System.out.print(i + " ");
                }
            }
        }
    }
}
