package course3;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        long lcm = lcm(n1, n2);
        System.out.println(lcm);
    }

    private static long lcm(long n1, long n2) {
        return (n1 * n2)/ gcd(n1, n2);
    }

    private static long gcd (long n1, long n2) {
        if (n2 % n1 == 0) {
            return n1;
        }
        return gcd(n2 % n1, n1);
    }
}
