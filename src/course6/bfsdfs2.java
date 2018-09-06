package course6;

import java.util.*;

public class bfsdfs2 {
    static int nV; // num of vertices
    static int nE; // num of edges
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

        for (int i = 0; i < nV; i++) {
           Collections.sort(adlist.get(i));
        } // read the problem properly!!

        dfsVisited = new boolean[nV];
        bfsVisited = new boolean[nV];
        dfs(0);
        System.out.println();
        bfs(0);
        sc.close();
    }

    private static void dfs(int root) {
        if (!dfsVisited[root]) {
            dfsVisited[root] = true;
            System.out.print(root + " ");
            for (int i = 0; i < adlist.get(root).size(); i++) {
                if (!dfsVisited[adlist.get(root).get(i)]) {
                    dfs(adlist.get(root).get(i));
                }
            }
        }
    }

    private static void bfs(int root) {
        Queue<Integer> q = new LinkedList();
        q.add(root);
        bfsVisited[root] = true;
        System.out.print(root);
        while (!q.isEmpty()) {
            int element = q.remove();
            Iterator it = adlist.get(element).iterator();
            while (it.hasNext()) {
                int i = (int) it.next();
                if (!bfsVisited[i]) {
                    bfsVisited[i] = true;
                    q.add(i);
                    System.out.print(" " + i);
                }
            }
        }
    }
}
