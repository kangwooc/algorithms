package baekjoon.backtracking;

import java.util.Scanner;
// 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
//
// 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
public class NmOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        backtracking(n, m, 1);
        sc.close();
    }

    public static void backtracking(int n, int m, int count) {

    }
}
