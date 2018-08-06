package course3;

import java.util.Scanner;

public class combinationpascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = combined(n, m);
        System.out.println(result);
    }

    private static int combined(int m, int n) {
        if (m == n || n == 0) return 1;
        return combined(m-1, n-1) + combined(m - 1, n);
    }
}
