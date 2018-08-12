package course3;

import java.util.Scanner;

public class fractionsum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        long[][] num = new long[2][2];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        long deno = num[0][1] * num[1][1];
        long numer = (num[1][0] * num [0][1]) + (num[1][1] * num [0][0]);
        deno /= gcd(num[0][1] * num[1][1], numer);
        numer /= gcd(num[0][1] * num[1][1], numer);

        sb.append(numer + " ");
        sb.append(deno);
        System.out.println(sb.toString());

    }

    private static long gcd (long n1, long n2) {
        if (n2 % n1 == 0) {
            return n1;
        }
        return gcd(n2 % n1, n1);
    }
}