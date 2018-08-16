package course4;

import java.util.Scanner;
// hard question...
public class tobin3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[100];

        pat(n, k, 0, 0, a);
    }

    private static void pat(int n, int k, int x, int y, int[] a) {
        if (x >= n) {
            if (y == k) {
                for (int i = 0; i < n; i++) {
                    System.out.printf("%d", a[i]);
                }
                System.out.println();
            }
            return;
        }
        if (y < k) {
            a[x] = 1;
            pat(n, k,x + 1,y+1, a);
        }

        a[x] = 0;
        pat(n, k,x + 1, y, a);
    }
}
