import java.util.Scanner;

public class fractionsum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int[][] num = new int[2][2];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int deno = num[0][1] * num[1][1];
        int numer = (num[1][0] * num [0][1]) + (num[1][1] * num [0][0]);
        deno /= gcd(deno, numer);
        numer /= gcd(deno, numer);

        sb.append(numer + " ");
        sb.append(deno);
        System.out.println(sb.toString());

    }

    private static int gcd (int n1, int n2) {
        if (n2 % n1 == 0) {
            return n1;
        }
        return gcd(n2 % n1, n1);
    }
}
