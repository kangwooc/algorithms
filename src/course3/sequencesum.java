package course3;

import java.util.Scanner;

public class sequencesum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[N][N];
        int[] sequence = new int[N];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        if (N == 2) {
            System.out.println("1 1");
        } else {
            sequence[0] = ((arr[0][1] + arr[1][2] + arr[0][2]) / 2) - arr[1][2];
            sb.append(sequence[0] + " ");
            for (int i = 1; i < N; i ++) {
                sequence[i] = arr[i - 1][i] - sequence[i - 1];
                sb.append(sequence[i] + " ");
            }
            System.out.println(sb.toString());
        }
    }
}
