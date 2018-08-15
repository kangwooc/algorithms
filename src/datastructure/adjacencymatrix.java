package datastructure;
//인접 행렬
//      <단방향 인접 행렬/ 양방향 인접 행렬 소스코드>
//        정점의 개수를 N이라고 했을 때, N*N 크기의 이차원 배열을 이용하여 표현
//        A[i][j] = 1 (i -> j 간선이 있을 때), 0 (없을 때)
//        A[i][j] = weight (i -> j 간선이 있을 때), 0 (없을 때)    // 가중치 그래프 ex) 정점 이동간에 드는 비용
//        정점 u - v간의 간선 여부 확인
//        인접 행렬 - 정점 u, v가 주어졌을 때, 단 한 번의 배열의 접근만으로 연결 여부 파악 가능
//
//        공간 복잡도
//        인접 행렬 - V개의 Node를 표현하기 위해선 V*V 개수 만큼의 공간이 필요하므로 공간복잡도는 O(V^2)
//
//        결론
//        간선의 수가 V^2에 비례하는 그래프를 밀접 그래프 —> 인접 행렬

import java.io.BufferedReader;
import java.io.InputStreamReader;

// adjacency matrix
public class adjacencymatrix {
    static int nE; // number of Edge
    static int nV; // numver of vertices
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        nE = in.read();
        nV = in.read();
        int[][] ad = new int[nV + 1][nV + 1];
        for (int i = 0; i < nE; i++) {
            int t1 = in.read();
            int t2 = in.read();
            ad[t1][t2] = ad[t2][t1] = 1;
        }
    }
}
