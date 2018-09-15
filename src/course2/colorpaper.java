package course2;

import java.util.Scanner;

public class colorpaper {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[101][101];
        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int width = sc.nextInt();
            int height = sc.nextInt();
            for (int j = x1; j < x1 + width; j++) {
                for (int k = y1; k < y1 + height; k++) {
                    arr[j][k] = i;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            int count = 0;
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (arr[j][k] == i) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}
