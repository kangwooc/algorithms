package course4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class inequal {
    static int k;
    static String[] arr;
    static boolean[] visited;
    static List<String> result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        sc.nextLine();
        // < or >
        arr = sc.nextLine().split(" ");
        visited = new boolean[10];
        result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            visited[i] = true;
            solve(0, i, String.valueOf(i));
        }
        System.out.println(result.get(result.size()-1));
        System.out.println(result.get(0));
    }

    private static void solve(int cnt, int left, String t) {
        if (cnt == k) {
            result.add(t);
            visited[left] = false;
            return;
        }
        for (int i = 0; i < 10; i++) {
            // 방문 판단
            if(visited[i]) continue;
            if(left == i) continue;
            // 이전 수랑 부호 판단
            if(arr[cnt].equals(">")) {if(left < i) continue;}
            else if(left > i) continue;
            visited[i] = true;
            solve(cnt + 1, i,t + i);
        }
        visited[left] = false;
    }

}
