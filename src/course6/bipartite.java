package course6;

import java.util.*;

// 이분 그래프란, 아래 그림과 같이 정점을 크게 두 집합으로 나눌 수 있는 그래프를 말한다.
// 여기서 같은 집합에 속한 정점끼리는 간선이 존재해서는 안된다.

public class bipartite {
    static ArrayList<ArrayList<Integer>> adlist;
    static int nV;
    static int nE;
    static boolean[] visited;
    static int[] vertice;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nV = sc.nextInt();
        nE = sc.nextInt();
        adlist = new ArrayList<>();
        visited = new boolean[nV + 1];
        vertice = new int[nV + 1];
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
        if (isBipartite(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    private static boolean isBipartite(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        vertice[start] = 1;
        while (!q.isEmpty()) {
            int element = q.remove();
            Iterator it = adlist.get(element).iterator();
            while (it.hasNext()) {
                int i = (int) it.next();
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                    if (vertice[element] == 1) {
                        vertice[i] = 2;
                    } else if (vertice[element] == 2) {
                        vertice[i] = 1;
                    }
                }
            }
        }

        for (int i = 1; i <= nV; i++) {
            for (int j = 0; j < adlist.get(i).size(); j++) {
                if ((vertice[i] == vertice[adlist.get(i).get(j)])) {
                    return false;
                }
            }
        }
        return true;
    }
}
