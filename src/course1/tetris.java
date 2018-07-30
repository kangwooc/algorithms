package course1;

import java.util.Scanner;

public class tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] arr = new int[C][R];
        int X = 0; // initialize X
        int Y = 0;
        for (int i = 0; i < C; i++) {
            for (int k = 0; k < R; k++) {
                arr[i][k] = sc.nextInt();
            }
        }

        for (int k = 0; k < R; k++) {
            int count = 0;
            int touched = 0;
            for (int i = 0; i < C; i++) {
                if (arr[i][k] == 0) {
                    count++;
                } else {
                    touched = i;
                    break;
                }
            }
            if (count >= 4) {
                if (count == C) {
                    touched = C - 1;
                }

                for (int i = touched; i > touched - 4; i--) {
                    arr[i][k] = 1;
                }
                int score = 0;
                for (int i = 0; i < C; i++) {
                    int track = 0;
                    for (int h = 0; h < R; h++) {
                        if (arr[i][h] == 1) {
                            track++;
                        }
                    }
                    if (track == R) {
                        score++;
                    }
                }
                if (Y < score) {
                    X = k + 1;
                    Y = score;
                }

                for (int i = touched; i > touched - 4; i--) {
                    arr[i][k] = 0;
                }
            }
        }

        System.out.println(X + " " + Y);
        sc.close();
    }
}
