package Algorithms;

// 단일 출발지에서 최단 경로를 찾는 다익스트라 알고리즘
// 일단 모든 버텍스의 최단 거리값을 Infinity(무한)으로 설정합니다. 그리고 시작점(A) 최단 거리값을 0으로 설정합니다.
// 이제 A와 연결된 B, C의 거리값을 조정하는데, 시작점 거리값에 아크 값을 더한 것보다 도착점 거리값이 크면 도착점 거리값을 더한 값으로 낮춥니다.
// 점의 개수가 V이니까 복잡도는 배열에서 O(V^3), 이진 힙에서 O(VElgV), 피보나치 힙에서는 O(VE + V^2lgV)가 됩니다.

// reference:
// https://www.zerocho.com/category/Algorithm/post/584bd46f580277001862f1af
// http://bumbums.tistory.com/4
public class dijkstra {
    private int n;           //노드들의 수
    private int maps[][];    //노드들간의 가중치 저장할 변수

    public dijkstra(int n) {
        this.n = n;
        maps = new int[n + 1][n + 1];

    }

    public void input(int i,int j, int w) {
        maps[i][j] = w;
        maps[j][i] = w;
    }

    // base on dfs
    public void dijkstra(int v) {
        int distance[] = new int[n + 1];          //최단 거리를 저장할 변수 저장
        boolean[] check = new boolean[n + 1];     //해당 노드를 방문했는지 체크할 변수

        // distance 값 초기화.
        for (int i = 1; i < n + 1; i++) {
            distance[i] = Integer.MAX_VALUE;
        }

        // 시작노드값 초기화.
        distance[v] = 0;
        check[v] = true;

        // 연결노드 distance 갱신
        for (int i = 1; i < n + 1; i++) {
            if(!check[i] && maps[v][i] != 0){
                distance[i] = maps[v][i];
            }
        }

        for (int a = 0; a < n - 1; a++){
            // 원래는 모든 노드가 true가 될 때 까지 인데
            // 노드가 n개 있을 때 다익스트라를 위해서 반복수는 n-1번이면 된다.
            // 원하지 않으면 각각의 노드가 모두 true인지 확인하는 식으로 구현해도 된다.
            int min = Integer.MAX_VALUE;
            int min_index = -1;

            // 최소값 찾기
            for (int i = 1; i < n + 1; i++) {
                if(!check[i] && distance[i] != Integer.MAX_VALUE){
                    if(distance[i] < min){
                        min = distance[i];
                        min_index = i;
                    }
                }
            }

            check[min_index] = true;
            for (int i = 1; i < n + 1; i++) {
                if(!check[i] && maps[min_index][i]!=0){
                    if (distance[i] > distance[min_index] + maps[min_index][i]){
                        distance[i] = distance[min_index] + maps[min_index][i];
                    }
                }
            }
        }

        //결과값 출력
        for (int i = 1; i < n + 1; i++){
            System.out.print(distance[i] + " ");
        }
        System.out.println();

    }
}