package course1;

import java.util.Scanner;

public class seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int R = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr = new int[R][C];
        setArr(arr, C, R, 1, C * R);
        waitNum(arr, C, R, K);
    }

    private static void setArr(int[][] arr, int C, int R, int start, int end) {
        int dir = 1;
        int i = 0;
        int k = 0;
        int beginC = 0;
        int beginR = 0;
        int finR = R - 1;
        int finC = C - 1;
        while (start != end) {
            if (dir == 1) {
                arr[i][k] = start;
                start++;
                if (k == finR) {
                    dir++;
                    i++;
                    finR--;
                } else {
                    k++;
                }
            } else if (dir == 2) {
                arr[i][k] = start;
                start++;
                if (i == finC) {
                    dir++;
                    k--;
                    finC--;
                } else {
                    i++;
                }
            } else if (dir == 3) {
                arr[i][k] = start;
                start++;
                if (k == beginR) {
                    dir++;
                    beginR++;
                } else {
                    k--;
                }
            } else if (dir == 4) {
                arr[i][k] = start;
                start++;
                if (i == beginC) {
                    dir = 1;
                    beginC++;
                } else {
                    i--;
                }
            }
        }
    }

    private static void waitNum(int[][] arr, int C, int R, int K) {
        for (int i = 0; i < C; i++) {
            for (int k = 0; k < R; k++) {
                if (arr[i][k] == K) {
                    System.out.println((i + 1) + " " + (k + 1));
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
