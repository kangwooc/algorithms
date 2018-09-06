package course5;

import java.util.*;

public class treeheight {
    static Map<Integer, Integer> heightchecker;
    static ArrayList<ArrayList<Integer>> tree;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        tree = new ArrayList<>();
        visited = new boolean[n + r];
        heightchecker = new HashMap<>();
        for (int i = r; i < r + n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            tree.add(list);
            heightchecker.put(i, 0);
        }
        for (int i = 0; i < n - 1; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            tree.get(n1).add(n2);
        }
        int checked = maxHeight(r);
        System.out.println(checked);
        sc.close();
    }

    // bfs
    private static int maxHeight(int root) {
        if (tree.get(root).size() != 0) {
            Queue<Integer> q = new LinkedList<>();
            q.add(root);
            visited[root] = true;
            while (!q.isEmpty()) {
                int element = q.remove();
                Iterator it = tree.get(element).iterator();
                if (tree.get(element).size() != 0) {
                    while (it.hasNext()) {
                        int i = (int) it.next();
                        if (!visited[i]) {
                            q.add(i);
                            visited[i] = true;
                            heightchecker.put(i, heightchecker.get(element) + 1);
                        }
                    }
                }
            }
            return Collections.max(heightchecker.values());
        }
        return 0;
    }

}