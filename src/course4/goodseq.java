package course4;

import java.util.Scanner;

public class goodseq {
    static int n;
    static boolean stop = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dfs(1, "1");
    }

    public static void dfs(int len, String s) {
        if (stop) {
            return;
        }
        if (n == len) {
            stop = true;
            System.out.println(s);
        } else {
            for (int i = 1; i <= 3; i++) {
                if (isSatisfy(s + i)) {
                    dfs(len + 1, s + i);
                }
            }
        }
        // backtracking
    }

    public static boolean isSatisfy(String s) {
        int len = s.length();
        int loop = len / 2;
        int start = len - 1;
        int end = len;

        for (int i = 1; i <= loop; i++) {
            if (s.substring(start - i, end - i).equals(s.substring(start, end))) {
                return false;
            }
            start -= 1;
        }
        return true;
    }

}