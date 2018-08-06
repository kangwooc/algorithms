package course3;

import java.util.Scanner;

public class PROSJEK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] B = new int[N];
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }
        A[0] = B[0];
        int sum = B[0];
        for (int i = 2; i <= N; i++) {
            A[i - 1] = B[i - 1] * i - sum;
            sum += A[i - 1];
        }

        for (int i = 0; i < N - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[N - 1]);
    }
}
