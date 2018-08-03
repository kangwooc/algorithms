package course2;

import java.util.Scanner;

public class attackrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[][] arr = new String[size + 2][size + 2];

        int x = sc.nextInt();
        int y = sc.nextInt();
        int range = sc.nextInt();

        arr[x][y] = "x";

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == x && j == y) {
                    arr[i][j] = "x";
                } else {
                    arr[i][j] = String.valueOf(0);
                    for (int k = 1; k <= range; k++) {
                        if (Math.abs(Math.abs(x - i) + Math.abs(y - j)) == k && Math.abs(x - i) <= k && Math.abs(y - j) <= k) {
                            arr[i][j] = String.valueOf(k);
                        }
                    }
                }
            }
        }

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j < size; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(arr[i][size]);
        }
    }
}
