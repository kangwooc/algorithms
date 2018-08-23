package course4;

import java.util.Scanner;
// recursion
// subset problem...
// Super hard...
public class Division {
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x = 0;
        int y = num;
        int[] a = new int[100];
        div(x, y, num, a);
        System.out.println(count);
        sc.close();
    }

    private static void div(int x, int y, int num, int[] a) {
        if (y == 0) {
            for (int i = 0; i < x - 1; i++) {
                System.out.print(a[i] + "+");
            }
            System.out.println(a[x - 1]);
            count++;
            return;
        }

        for (int i = num - 1; i >= 1; i--) {
            if (y - i >= 0) {
                if (x == 0 || a[x - 1] >= i) {
                    a[x] = i;
                    div(x + 1, y - i, num, a);
                }
            }
        }
    }
}
