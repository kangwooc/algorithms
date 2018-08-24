package datastructure;

// <가중치 인접 리스트 코드 구현>

import java.util.ArrayList;
import java.util.Scanner;

class Edge <W, V>{ // Edge를 하나의 클래스로 표현하여 입력 받음
    private W weight; // edge에 부여된 가중치
    private V v; // edge 끝 부분에 있는 vertex의 번호

    public void set(W weight, V v) {
        this.weight = weight;
        this.v = v;
    }
}

public class adjacencylist2 {
    static int nV;
    static int nE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        adjacencylist2 hello = new adjacencylist2();

        nV = sc.nextInt();
        nE = sc.nextInt();

        ArrayList<Edge> ad = new ArrayList<>();
        Edge<Integer, Integer> ed = new Edge<>(); // 가중치 적용...

        for (int i = 0; i < nE; i++) {
            ad.add(new Edge<Integer, Integer>()); // memory allocation
        }

        for (int i = 0; i < nV; i++) {
            int t1 = sc.nextInt(); // 시작 vertex 입력 받기
            int t2 = sc.nextInt(); // 끝 vertex 입력 받기
            int t3 = sc.nextInt(); // weight 입력 받기

            ad.get(t1).set(t3, t2);
            ad.get(t2).set(t3, t1);
        }
    }
}
