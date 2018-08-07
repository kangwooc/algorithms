package course3;

import java.util.Scanner;

public class pfactorization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 2;
        while (i < N) {
            if (N % i == 0) {
                System.out.println(i);
                N /= i;
            } else {
                i++;
            }
        }
        System.out.println(N);

    }
}
