import java.util.*;
//  프로그래머스 가장 먼 노드
// DFS
// https://programmers.co.kr/learn/courses/30/lessons/49189
class FurtherNode {
    public static void main(String[] args) {
        System.out.println(solution(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}));
    }

    public static int solution(int n, int[][] edge) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] e : edge) {
            if (!map.containsKey(e[0])) {
                map.put(e[0], new ArrayList<>());
            }
            map.get(e[0]).add(e[1]);
        }
        boolean[] visited = new boolean[n + 1];
        List<Integer> list = new ArrayList<>();
        dfs(map, visited, 1, list);
        return list.size();
    }

    public static void dfs(Map<Integer, List<Integer>> map, boolean[] visited, int node, List<Integer> list) {
        if (!map.containsKey(node)) {
            list.add(node);
            return;
        }

        if (map.get(node).size() == 1 && visited[map.get(node).get(0)]) {
            list.add(node);
            return;
        }

        if (visited[node]) {
            return;
        }

        visited[node] = true;
        for (int i = 0; i < map.get(node).size(); i++) {
            dfs(map, visited, map.get(node).get(i), list);
        }
    }
}