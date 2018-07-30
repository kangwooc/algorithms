package course1;

import java.util.Scanner;

public class gcdlcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int gcm = gcm(n1, n2);
        int lcm = lcm(n1, n2);

        System.out.println(gcm);
        System.out.println(lcm);

    }

    private static int gcm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcm(n2, n1 % n2); // 유클리드 호제법
    }

    private static int lcm(int n1, int n2) {
        return n1 * n2 / gcm(n1, n2);
    }
}
