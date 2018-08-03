package course2;

import java.util.Scanner;

public class rook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] chess = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chess[i][j] = sc.nextInt();
            }
        }
        int x = 0, y = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (chess[i][j] == 1) {
                    x = i;
                    y = j;
                }
            }
        }

        int flag = 0;
        for (int i = 0; i < 8; i++) {
            if (chess[i][y] == 2) {
                flag = 1;
                if (i < x) {
                    for (int k = i + 1; k < x; k++) {
                        if (chess[k][y] == 3) {
                            flag = 0;
                            break;
                        }
                    }
                } else if (i > x) {
                    for (int k = x; k < i; k++) {
                        if (chess[k][y] == 3) {
                            flag = 0;
                            break;
                        }
                    }
                }
            }
            if (chess[x][i] == 2) {
                flag = 1;
                if (i < y) {
                    for (int k = i + 1; k < y; k++) {
                        if (chess[x][k] == 3) {
                            flag = 0;
                            break;
                        }
                    }
                } else if (i > y) {
                    for (int k = y; k < i; k++) {
                        if (chess[x][k] == 3) {
                            flag = 0;
                            break;
                        }
                    }
                }
            }
        }
        if (flag == 1) {
            System.out.println(flag);
        } else {
            System.out.println(0);
        }
    }
}
