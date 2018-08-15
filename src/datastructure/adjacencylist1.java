package datastructure;

import java.util.ArrayList;
import java.util.Scanner;

// 인접 리스트
//
// 그래프의 각 정점마다 해당 정점에서 나가는 간선의 목록을 저장해서 그래프로 표현
// 각 정점마다 하나의 연결리스트를 갖는 방식으로 구현
// 양 방향 인접 그래프
//
// 정점 u - v간의 간선 여부 확인
// 인접 리스트 - ad[u]의 처음부터 읽어나가면서 각 원소를 일일이 확인해야 함
//
// 공간 복잡도
// 인접 리스트 - V개의 리스트에 실제 간선만큼 원소가 들어 있으므로, 공간복잡도는 O(V+E)
// 만약 간선의 개수가 V^2에 수렴한다면 비슷할 수 있으나, 현실 세계에서는 간선의 수가 훨씬 적은 그래프가 많음
//
// 결론
// 간선의 수가 V^2에 비해 훨씬 적은 그래프를 희소 그래프 —> 인접 리스트

public class adjacencylist1 {
    static int nE; // total nums if Edge
    static int nV; // total nums of Vertex

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nE = sc.nextInt();
        nV = sc.nextInt();
        ArrayList<ArrayList<Integer>> ad = new ArrayList<>(); // 인접 리스트 초기화
        for (int i = 0; i < nV; i++) {
            ad.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < nE; i++) {
            int t1, t2;
            t1 = sc.nextInt();
            t2 = sc.nextInt();

            ad.get(t2).add(t1);
            ad.get(t1).add(t2);
        }
    }
}