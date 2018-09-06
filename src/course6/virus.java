package course6;

import java.util.*;

public class virus {
    static int nV, nE;
    static ArrayList<ArrayList<Integer>> adlist;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();
        visited = new boolean[nV + 1];
        adlist = new ArrayList<>();
        for (int i = 0; i <= nV; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            adlist.add(list);
        }

        for (int i = 0; i < nE; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            adlist.get(n1).add(n2);
            adlist.get(n2).add(n1);
        }
        bfs(1);
        sc.close();
    }

    private static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        int virused = 0;
        while (!q.isEmpty()) {
            int element = q.remove();
            Iterator it = adlist.get(element).iterator();
            while (it.hasNext()) {
                int i = (int) it.next();
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    virused++;
                }
            }
        }
        System.out.println(virused);
    }
}
