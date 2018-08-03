package course3;

import java.util.Scanner;
public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm = lcm(n1, n2);
        System.out.println(lcm);
    }

    private static int lcm(int n1, int n2) {
        return (n1 * n2)/ gcd(n1, n2);
    }

    private static int gcd(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcd(n2, n1 % n2);
    }
}
