package course4;

import java.util.*;

public class danji {
    static int n, ans, cnt;
    static int[][] a = new int[26][26];
    static int[] dx = {-1,1,0,0}, dy = {0,0,-1,1};
    static boolean[][] c = new boolean[26][26];
    static List<Integer> num = new ArrayList<>();

    private static void go(int x, int y){
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx < 0 || nx >= n || ny < 0 || ny >= n) continue;
            if (c[nx][ny] || a[nx][ny] == 0) continue;
            c[nx][ny] = true;
            a[nx][ny] = ans;
            go(nx, ny);
            ++cnt;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 0; i < n; i++){
            String s = in.next();
            for (int j = 0; j < n; j++)
                a[i][j] = s.charAt(j) - 48;
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if(a[i][j] == 0 || c[i][j]) continue;
                c[i][j] = true;
                ++cnt;
                ++ans;
                go(i, j);
                num.add(cnt);
                cnt = 0;
            }
        }
        System.out.println(ans);
        Collections.sort(num);
        for(int i : num)
            System.out.println(i);
        in.close();
    }
}